package ETicaretBackend.business.concretes;

import java.util.List;

import ETicaretBackend.business.abstracts.UserManagerService;
import ETicaretBackend.core.abstracts.EmailCheckService;
import ETicaretBackend.core.abstracts.GoogleLoggerService;
import ETicaretBackend.core.abstracts.UserCheckService;
import ETicaretBackend.dataAccess.abstracts.UserDao;
import ETicaretBackend.entities.concretes.User;

public class UserManager implements UserManagerService{
	private EmailCheckService eMailCheck;
	private UserCheckService userCheck;
	private UserDao userDao;
	
	
	public UserManager(EmailCheckService eMailCheck, UserCheckService userCheck, UserDao userDao,
			GoogleLoggerService googleLoggerService) {
		super();
		this.eMailCheck = eMailCheck;
		this.userCheck = userCheck;
		this.userDao = userDao;
	}


	@Override
	public void add(User user) {
		if(userDao.get(user.geteMail()) != eMailCheck) {
			System.out.println("Bu Email Kullan�lmakta.");
			return;
		}
		if(!eMailCheck.isValid(user.geteMail())) {
			System.out.println("Ge�ersiz Email ");
		}else if(userCheck.checkName(user.getFirstName(), user.getLastName()) && userCheck.checkPassword(user.getPasword())) {
			userCheck.checkVerify();
			userDao.add(user);
			
		}
	}
	
	@Override
	public void uptade(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi");
		
	}


	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� bilgileri silindi");
	}


	@Override
	public void login(String eMail, String password) {
		if(userDao.get(eMail) != null) {
			User user = userDao.get(eMail);
			if(user.getPasword().equals(password)) {
				System.out.println("Giri� ba�ar�l�");
			}else {
				System.out.println("�ifrenizi kontrol ediniz.");
			}
		}else {
			System.out.println("Ge�ersiz E-Mail");
		}
		
	}


	@Override
	public List<User> getAll() {
		
		return null;
	}

	
	

}
