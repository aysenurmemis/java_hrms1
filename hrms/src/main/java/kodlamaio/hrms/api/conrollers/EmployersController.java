package kodlamaio.hrms.api.conrollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployersService employersService;
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@GetMapping("/getAll")
	public DataResults<List<Employers>> getAll(){
		return this.employersService.getAll();
		
	}
	
	@PostMapping("/add") 
	public Result add(@RequestBody Employers employers) {
		return this.employersService.add(employers);
	}
}
