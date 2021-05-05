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
					
			log.LogMessage(communicationService, "Baþarýlý");
			
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
		
		
	}

	@Override
	public void Update(Communication communicationService) {
		
		try {
			System.out.println(communicationService.getId() + "'li iletiþim güncellendi.");
			log.LogMessage(communicationService, "Baþarýlý");
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
		
	}

	@Override
	public void Delete(Communication communicationService) {
		try {
			System.out.println(communicationService.getId() + "'li iletiþim SÝLÝNDÝ.");
			log.LogMessage(communicationService, "Baþarýlý");
		} catch (Exception e) {
			log.LogMessage(communicationService, "Hata");
		}
		
	}


}
