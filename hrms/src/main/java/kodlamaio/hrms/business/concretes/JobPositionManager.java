package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResults<List<JobPositions>> getAll() {
		return new SuccessDataResult<List<JobPositions>>
		(this.jobPositionDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(JobPositions jobPositions) {
		this.jobPositionDao.save(jobPositions);
		return new SuccessResult("Ürün eklendi");
	}
	
	

}
