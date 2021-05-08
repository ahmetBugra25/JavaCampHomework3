package ETicaretBackend;

import ETicaretBackend.business.concretes.UserManager;
import ETicaretBackend.core.abstracts.EmailCheckService;
import ETicaretBackend.core.abstracts.UserCheckService;
import ETicaretBackend.core.concretes.EmailCheckManager;
import ETicaretBackend.core.concretes.GoogleLoggerAdapter;
import ETicaretBackend.core.concretes.UserCheckManager;
import ETicaretBackend.dataAccess.abstracts.UserDao;
import ETicaretBackend.dataAccess.concretes.HipernateUserDao;
import ETicaretBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(25,"Ahmet","BALKAYA","balkaya@gmail.com","25364178");
		User user1 = new User(36,"Buðra","BALKAYA","bugra@hotmail.com","123456789");
		User user2 = new User(41,"Kenan","DUR","benanDur@gmail.com","789456123");
		
		
		GoogleLoggerAdapter googleLoggerAdapter = new GoogleLoggerAdapter();
		UserDao userDao = new HipernateUserDao();
		EmailCheckService eMailCheck = new EmailCheckManager(); 
		UserCheckService userCheck = new UserCheckManager();
		
		UserManager userManager = new UserManager(eMailCheck,userCheck,userDao,googleLoggerAdapter);
		userManager.add(user);
		userManager.login("Balkaya@gmail.com","25364178");
		System.out.println("---------------------------");
		userManager.uptade(user1);
		System.out.println("---------------------------");
		userManager.delete(user2);
	
	}

}
