package org.dnyanyog.services;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementServices {
	@Autowired
	UsersRepository userRepo;
	
	public UserResponse addUpdateUser(UserRequest request) {
		
		UserResponse response = new UserResponse();
		Users usersTable = new Users();
		
		usersTable.setAge(request.getAge());
		usersTable.setEmail(request.getEmail());
		usersTable.setPassword(request.getPassword());
		usersTable.setUsername(request.getUsername());
		usersTable = userRepo.save(usersTable);
		
		
		response.setMessage("User added successfully");
		response.setStatus("Success");
		response.setUserId(usersTable.getUserId());
		
		return response;
	}

}
