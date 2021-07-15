package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByStatus(boolean status);
	
	List<JobAdvertisement> getByStatus(boolean status, Sort sort);

	List<JobAdvertisement> getByEmployer_IdAndStatus(int employerId,boolean status);

	
}
