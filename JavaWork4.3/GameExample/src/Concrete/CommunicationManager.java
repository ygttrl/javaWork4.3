package Concrete;

import Abstruct.CommunicationService;
import Abstruct.Log;
import Entity.Communication;

public class CommunicationManager implements CommunicationService {
	
	private Log log;
	
	public CommunicationManager(Log log) 
	{
		this.log=log;
	}

	@Override
	public void Add(Communication communicationService) {
		
		try {
			System.out.println(
					communicationService.getId()
					+" "
					+communicationService.getPhoneNumber()
					+" "
					+communicationService.getAddress()
					+" Eklendi ");				
					
			log.LogMessage(communicationService, "Ba�ar�l�");
			
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
		
		
	}

	@Override
	public void Update(Communication communicationService) {
		
		try {
			System.out.println(communicationService.getId() + "'li ileti�im g�ncellendi.");
			log.LogMessage(communicationService, "Ba�ar�l�");
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
		
	}

	@Override
	public void Delete(Communication communicationService) {
		try {
			System.out.println(communicationService.getId() + "'li ileti�im S�L�ND�.");
			log.LogMessage(communicationService, "Ba�ar�l�");
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
	}


}
