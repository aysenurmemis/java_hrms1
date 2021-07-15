package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidatesService {

	DataResults<List<Candidates>> getAll();
	Result add(Candidates candidates);
	
}
