package Concrete.Logs;

import Abstruct.Entity;
import Abstruct.Log;

public class FileLog implements Log {

	@Override
	public void LogMessage(Entity entity, String message) {
		System.out.println(entity.getId()+" File ile loðlandý " +message);
		
	}

}
