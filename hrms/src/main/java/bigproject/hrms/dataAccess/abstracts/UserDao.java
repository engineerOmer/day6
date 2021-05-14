package bigproject.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import bigproject.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

	

}
