package main.java.com.mps.wiley.ebb.domain;

import java.io.Serializable;
import java.util.Date;

public class RegisteredUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2156322431232366320L;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String name;

	private String email;

	private String phone;

	private String address;

	private String gender;

	private String country;

}