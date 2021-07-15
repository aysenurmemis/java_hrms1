package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResults;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("iş ilanı eklendi");
	}

	@Override
	public DataResults<List<JobAdvertisement>> getAll() {

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data listelendi.");
	}

	@Override
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisement() {

		List<JobAdvertisement> activeJob = this.jobAdvertisementDao.getByStatus(true);
		return new SuccessDataResult<List<JobAdvertisement>>(activeJob,"aktif iş ilanları listelendi") ;
	}

	@Override
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisementSortByLastDate(String direction) {

		Sort sort = Sort.by(Direction.fromString(direction),"LastDate");
		List<JobAdvertisement> sortedAdvertsement = this.jobAdvertisementDao.getByStatus(true, sort);
		return new SuccessDataResult<List<JobAdvertisement>>(sortedAdvertsement,"iş ilanları tarihe göre sıralandı");
	}

	@Override
	public DataResults<List<JobAdvertisement>> getAllActiveAdvertisementByEmployerId(int employerId) {

		List<JobAdvertisement> employerActive = this.jobAdvertisementDao.getByEmployer_IdAndStatus(employerId, true);
		return new SuccessDataResult<List<JobAdvertisement>>(employerActive,"firmaya ait iş ilanları listelendi") ;
	}

	
}
