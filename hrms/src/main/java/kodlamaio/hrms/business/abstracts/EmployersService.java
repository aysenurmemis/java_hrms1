package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employers;

public interface EmployersService {

	DataResults<List<Employers>> getAll();
	Result add(Employers employers);
	
}
