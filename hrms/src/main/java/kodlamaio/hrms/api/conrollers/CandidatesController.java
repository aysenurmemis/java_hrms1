package kodlamaio.hrms.api.conrollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidatesService candidatesService;
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@GetMapping("/getAll")// böyle istekte bulunursam bu calışacak
	public DataResults<List<Candidates>> getAll(){
		return this.candidatesService.getAll();
		
	}
	
	@PostMapping("/add")  //request eşleştirme yapıyor(bilgileri bir pakete koyuyor)
	public Result add(@RequestBody Candidates candidates) {
		return this.candidatesService.add(candidates);
	}
}
