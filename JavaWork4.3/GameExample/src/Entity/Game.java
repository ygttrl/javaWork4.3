package Entity;

import java.time.LocalDate;

import Abstruct.Entity;

public class Game extends Entity {
	
	private String gameName;
	private LocalDate publishDate;
	private GameCategory gameCategory;
	private int price;
	
	public Game() 
	{
		
	}
	
	
	public Game(int id, String gameName, LocalDate publishDate,int price, GameCategory gameCategory) {
		setId(id);
		this.gameName = gameName;
		this.publishDate = publishDate;
		this.price=price;
		this.gameCategory = gameCategory;
	}


	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public GameCategory getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(GameCategory gameCategory) {
		this.gameCategory = gameCategory;
	}
}
