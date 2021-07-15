package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService{

	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}
	
	

	@Override
	public DataResults<List<Candidates>> getAll() {

		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(),"Data listelendi");
	}


	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Ürün eklendi");
		
	}

}
