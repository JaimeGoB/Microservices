package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	
	/*The annotations provided by the fields will make sure 
	 * a value provided by http post will meet requierements
	 * otherwise it will give an error.
	 * The validations we will work with arE:
	 * Not null
	 * Size
	 * Email
	 * */
	
	@NotNull(message = "First name cannot be empty.")
	@Size(min = 2, message = "First name must not be less than 2 characters.")
	private String firstName;
	
	@NotNull(message = "Last name cannot be empty.")
	@Size(min = 2, message = "Last name must not be less than 2 characters.")
	private String lastName;
	
	@NotNull(message = "Password cannot be null.")
	@Size(min = 8, max = 16, message = "Password should have between 8-16 characters.")
	private String password;
	
	@NotNull(message = "Email cannot be null.")
	@Email
	private String email;


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
