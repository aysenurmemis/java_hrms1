package kodlamaio.hrms.api.conrollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemPersonService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonels;

@RestController
@RequestMapping("/api/system_personels")
public class SystemPersonController {

	private SystemPersonService systemPersonService;
	public SystemPersonController(SystemPersonService systemPersonService) {
		super();
		this.systemPersonService = systemPersonService;
	}
	
	@GetMapping("/getAll")
	public DataResults<List<SystemPersonels>> getAll(){
		return this.systemPersonService.getAll();
		
	}
	
	@PostMapping("/add") 
	public Result add(@RequestBody SystemPersonels systemPersonels) {
		return this.systemPersonService.add(systemPersonels);
		
	}	
}
