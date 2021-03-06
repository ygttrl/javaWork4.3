package Concrete;

import Abstruct.GamerService;
import Abstruct.Log;
import Abstruct.MersisService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	private MersisService mersisService ;
	private Log log;	
	
	public GamerManager(MersisService mersisService,Log log) {
	
		this.mersisService = mersisService;
		this.log=log;
	}

	@Override
	public void Add(Gamer gamer) {
		
		try {
			if (mersisService.CheckPerson(gamer)) {			
				System.out.println(
							gamer.getId()+" "+gamer.getName()+" "+gamer.getSurname()+" "+gamer.getIdentityNumber()+" "
				+gamer.getCommunication().getEmail()+" Gamer Eklendi."
						);
			}
			log.LogMessage(gamer, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gamer, "Hatal?");
		}

		
		
	}

	@Override
	public void Update(Gamer gamer) {
		
		try {
			System.out.println(gamer.getId()+" id'li Gamer g?ncellendi.");
			log.LogMessage(gamer, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gamer, "Hatal?");
		}
		
	}

	@Override
	public void Delete(Gamer gamer) {
		try {
			System.out.println(gamer.getId()+" id'li Gamer silindi!!");
			log.LogMessage(gamer, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gamer, "Hatal?");
		}
		
	}

}
