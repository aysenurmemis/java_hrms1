package kodlamaio.hrms.api.conrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;


@RestController
@RequestMapping("api/job_advertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
	
		return this.jobAdvertisementService.add(jobAdvertisement);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();	
	}
	
	@GetMapping("/activeJobAdvertisements")
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisement() {
		return this.jobAdvertisementService.getAllActiveAdvertisement();
	}

	@GetMapping("/activeJobAdvertisement/sortByLastDate")
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(
			@RequestParam(defaultValue = "asc") String direction) {
		return this.jobAdvertisementService.getAllActiveAdvertisementSortByLastDate(direction);
	}
	
	@GetMapping("/activeJobAdvertisement/employer")
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(@RequestParam() int employerId){
		return this.jobAdvertisementService.getAllActiveAdvertisementByEmployerId(employerId);
		
	}
}
