package Concrete;

import Abstruct.MersisService;
import Entity.Gamer;

public class MersisManager implements MersisService {

	@Override
	public boolean CheckPerson(Gamer gamer) {
		System.out.println(gamer.getIdentityNumber() +"'li Ki�inin Kimli�i do�ruland�!!");
		return true;
	}

}
