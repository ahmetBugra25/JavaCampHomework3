 package ETicaretBackend.core.concretes;

import ETicaretBackend.core.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkName(String firstName, String lastName) {
		if(firstName.length()>=2 && lastName.length()>=2) {
			return true;
		}
		System.out.println("Ýsminiz en az 2 karekter olmalý");
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()>=6) {
			return true;
		}
		System.out.println("Þifreniz en az 6 karekter içermelidir.");
		return false;
	}

	@Override
	public boolean checkVerify() {
		System.out.println("Doðrulama linki gönderildi");
		return true;
	}
	

}
