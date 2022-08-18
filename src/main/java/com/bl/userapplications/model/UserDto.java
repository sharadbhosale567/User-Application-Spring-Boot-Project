package com.bl.userapplications.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {
	private String email;
	private String password;
	
	public UserDto(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public UserDto() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDto [email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	

}
