package org.dnyanyog.controller;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.services.UserManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementServices userService;
	
	@PostMapping(path="/auth/user",consumes = {"application/json","application/xml"}, produces= {"application/json","application/xml"})
	public UserResponse addUpdateUser(@RequestBody UserRequest userRequest)
	{
		return userService.addUpdateUser(userRequest);

}

}
