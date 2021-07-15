package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);

	DataResults<List<JobAdvertisement>> getAll();
	
	DataResults<List<JobAdvertisement>> getAllActiveAdvertisement();
	
	DataResults<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(String direction);
	
	DataResults<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(int employerId);
	
}
