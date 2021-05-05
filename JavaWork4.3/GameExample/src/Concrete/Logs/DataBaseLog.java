package Concrete.Logs;
import Abstruct.Entity;
import Abstruct.Log;

public class DataBaseLog implements Log {

	@Override
	public void LogMessage(Entity entity, String message) {
		System.out.println(entity.getId()+" DataBase ile loðlandý " +message);
		
	}

}
