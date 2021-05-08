package ETicaretBackend.dataAccess.concretes;

import java.util.List;

import ETicaretBackend.dataAccess.abstracts.UserDao;
import ETicaretBackend.entities.concretes.User;

public class HipernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hipernate ile eklendi." + user.getFirstName()+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hipernate ile güncellendi" + user.getFirstName()+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hipernate ile silindi"+user.getFirstName()+user.getLastName());
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public User get(String mesage) {
		
		return null;
	}
	
	
	

}
