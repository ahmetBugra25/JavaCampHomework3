package ETicaretBackend.core.concretes;

import ETicaretBackend.GoogleLogger.GoogleLoggerManager;
import ETicaretBackend.core.abstracts.GoogleLoggerService;

public class GoogleLoggerAdapter implements GoogleLoggerService {

	@Override
	public void logToSystem(String mesage) {
		GoogleLoggerManager manager =new GoogleLoggerManager();
		manager.log(mesage);
		
	}
	

}
