package Concrete;

import Abstruct.GameService;
import Abstruct.Log;
import Entity.Game;

public class GameManager implements GameService {

	private Log log;
	
	public GameManager(Log log) {
		
		this.log = log;
	}

	@Override
	public void Add(Game game) {
		try {
			System.out.println(game.getId() +" "+game.getGameName()+" "+game.getPublishDate()+" "+game.getGameCategory().getCategoryName()+" Oyun Eklendi.");
			log.LogMessage(game, "Ba?ar?l?.");
		} catch (Exception e) {
			log.LogMessage(game, "Hatal?.");
		}
	}

	@Override
	public void Update(Game game) {
		
		try {
			System.out.println(game.getId() +" 'li Oyun G?ncellendi.");
			log.LogMessage(game, "Ba?ar?l?.");
		} catch (Exception e) {
			log.LogMessage(game, "Hatal?.");
		}
	}

	@Override
	public void Delete(Game game) {
		
		try {
			System.out.println(game.getId() +" 'li Oyun S?L?ND?!!!");
			log.LogMessage(game, "Ba?ar?l?.");
		} catch (Exception e) {
			log.LogMessage(game, "Hatal?.");
		}
		
		
		
	}

}
