package Entity;

import Abstruct.Entity;

public class Communication extends Entity {
	
	private String phoneNumber;
	private String email;
	private String address;
	
	public Communication()
	{}
	
	public Communication(int id,String phoneNumber, String email, String address) {
		setId(id);
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
