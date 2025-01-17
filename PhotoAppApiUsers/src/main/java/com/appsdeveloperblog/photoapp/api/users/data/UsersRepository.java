package com.appsdeveloperblog.photoapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

//First data type is the object we will store and the second one is the id
//We will store a UserEntity by its id
public interface UsersRepository extends CrudRepository<UserEntity, Long> {

}
