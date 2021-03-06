package Entity;

import Abstruct.Entity;

public class Discount extends Entity {
	
	private String discountName;
	private int discountRate;
	
	public Discount() 
	{
		
	}
	

	public Discount(int id, String discountName, int discountRate) {
		setId(id);
		this.discountName = discountName;
		this.discountRate = discountRate;
	}


	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
}
