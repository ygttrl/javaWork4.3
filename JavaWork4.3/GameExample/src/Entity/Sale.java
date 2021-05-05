package Entity;

import Abstruct.Entity;

public class Sale extends Entity {
	
	private Gamer gamer;
	private Game game;
	private Discount discount;
	
	public Sale() 
	{
		
	}
	
	public Sale(int id,Gamer gamer, Game game, Discount discount) {
		setId(id);
		this.gamer = gamer;
		this.game = game;
		this.discount = discount;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	
}
