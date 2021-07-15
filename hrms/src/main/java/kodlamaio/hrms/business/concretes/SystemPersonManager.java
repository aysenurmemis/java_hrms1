package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemPersonService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonelDao;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.SystemPersonels;

@Service
public class SystemPersonManager implements SystemPersonService {

	private SystemPersonelDao systemPersonelDao;
	
	@Autowired
	public SystemPersonManager(SystemPersonelDao systemPersonelDao) {
		super();
		this.systemPersonelDao = systemPersonelDao;
	}

	@Override
	public DataResults<List<SystemPersonels>> getAll() {
		return new SuccessDataResult<List<SystemPersonels>>
		(this.systemPersonelDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(SystemPersonels systemPersonels) {
		this.systemPersonelDao.save(systemPersonels);
		return new SuccessResult("Ürün eklendi");
	}
	
	

}
