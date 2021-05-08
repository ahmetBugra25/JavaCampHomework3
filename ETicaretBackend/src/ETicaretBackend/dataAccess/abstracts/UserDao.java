package ETicaretBackend.dataAccess.abstracts;

import java.util.List;

import ETicaretBackend.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(String mesage);
	List<User> getAll();
	User get(int id);
	

}
