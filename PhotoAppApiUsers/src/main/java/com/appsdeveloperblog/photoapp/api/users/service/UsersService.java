package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

public interface UsersService {
	
	//Create User - will accept user details in the form of data transfer object. 
	UserDto createUser(UserDto userDetails);
}
