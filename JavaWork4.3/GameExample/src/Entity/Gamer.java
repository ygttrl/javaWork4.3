package Entity;

import Abstruct.Entity;

public class Gamer extends Entity {
	
	private String name;
	private String surname;
	private String identityNumber;
	private Communication communication;
	
	public Gamer() 
	{
		
	}

	public Gamer(int id, String name, String surname, String identityNumber, Communication communication) {
		setId(id);
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.communication = communication;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Communication getCommunication() {
		return communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}
}
