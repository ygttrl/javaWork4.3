package Concrete;

import Abstruct.GameCategoryService;
import Abstruct.Log;
import Entity.GameCategory;

public class GameCategoryManager implements GameCategoryService {

	
	private Log log;
	
	public GameCategoryManager(Log log) {
		
		this.log = log;
	}

	@Override
	public void Add(GameCategory gameCategory) {
		
		try {
			System.out.println(gameCategory.getId()+" "+gameCategory.getCategoryName()+" Oyun Kategorisi eklendi.");
			log.LogMessage(gameCategory, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gameCategory, "Hatal?");
		}
		
	}

	@Override
	public void Update(GameCategory gameCategory) {
		
		try {
			System.out.println(gameCategory.getId()+" 'li Oyun Kategorisi G?ncellendi.");
			log.LogMessage(gameCategory, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gameCategory, "Hatal?");
		}
		
	}

	@Override
	public void Delete(GameCategory gameCategory) {
		
		try {
			System.out.println(gameCategory.getId()+" 'li Oyun Kategorisi S?L?ND?.");
			log.LogMessage(gameCategory, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(gameCategory, "Hatal?");
		}
		
	}

	

}
