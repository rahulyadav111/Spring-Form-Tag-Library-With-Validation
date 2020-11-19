package model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User 
{	
	@NotBlank(message=" ** required field")
	private String username;
	
	@Size(min=3,message=" ** at least 3 characters")
	private String password;
	
	@NotBlank(message=" ** required field")
	private String gender;
	
	@NotBlank(message=" ** choose at least one  field")
	private String cards;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCards() {
		return cards;
	}
	public void setCards(String cards) {
		this.cards = cards;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
