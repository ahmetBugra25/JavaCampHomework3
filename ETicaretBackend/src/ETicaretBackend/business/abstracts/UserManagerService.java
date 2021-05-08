package ETicaretBackend.business.abstracts;

import java.util.List;

import ETicaretBackend.entities.concretes.User;

public interface UserManagerService {
	void add(User user);
	void uptade(User user);
	void delete(User user);
	void login(String eMail,String password);
	List<User> getAll();
	

}
