package kodlamaio.hrms.api.conrollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/job_positions")
public class JobPositionsController {

	private JobPositionService jobPositionService;
	
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getAll")
	public DataResults<List<JobPositions>> getAll(){
		return this.jobPositionService.getAll();
		
	}
	
	@PostMapping("/add")  
	public Result add(@RequestBody JobPositions jobPositions) {
		return this.jobPositionService.add(jobPositions);
	
	}
}
