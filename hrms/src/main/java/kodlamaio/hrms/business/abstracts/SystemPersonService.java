package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonels;

public interface SystemPersonService {

	DataResults<List<SystemPersonels>> getAll();
	Result add(SystemPersonels systemPersonels);
	
}
