package Concrete.Logs;

import Abstruct.Entity;
import Abstruct.Log;

public class SmsLog implements Log {

	@Override
	public void LogMessage(Entity entity, String message) {
		
		System.out.println(entity.getId()+" SMS ile Lo?land? "+message);
		
	}
     
}
