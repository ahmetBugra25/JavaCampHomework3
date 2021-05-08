package ETicaretBackend.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ETicaretBackend.core.abstracts.EmailCheckService;

public class EmailCheckManager implements EmailCheckService {

	@Override
	public boolean isValid(String eMail) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(eMail);
		
		return matcher.matches();
	}
	

}
