package Entity;

import Abstruct.Entity;

public class GameCategory extends Entity {
	
	private String categoryName;
	
	public GameCategory() 
	{
		
	}

	public GameCategory(int id,String categoryName) {
		setId(id);
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
