package bigproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigproject.hrms.business.abstracts.UserService;
import bigproject.hrms.dataAccess.abstracts.UserDao;
import bigproject.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}
	
}
