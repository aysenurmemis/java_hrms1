package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPositions;

public interface JobPositionService {
	
	DataResults<List<JobPositions>> getAll();
	Result add(JobPositions jobPositions);
	
}
