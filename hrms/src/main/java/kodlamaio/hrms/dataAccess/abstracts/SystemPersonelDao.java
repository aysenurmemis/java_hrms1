package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemPersonels;

public interface SystemPersonelDao extends JpaRepository<SystemPersonels,Integer>{

}
