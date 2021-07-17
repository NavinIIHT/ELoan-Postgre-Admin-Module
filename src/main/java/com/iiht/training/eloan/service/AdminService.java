package com.iiht.training.eloan.service;

import java.util.List;

import com.iiht.training.eloan.model.UserDto;

public interface AdminService {

	
	public UserDto registerClerk(UserDto userDto);
		
	public UserDto registerManager(UserDto userDto);
	
	public List<UserDto> getAllClerks();
		
	public List<UserDto> getAllManagers();
	
	public UserDto enableClerk(Long clerkId);
	
	public UserDto disableClerk(Long clerkId);
	
	public UserDto enableManager(Long managerId);
	
	public UserDto disableManager(Long managerId);
	
	public UserDto enableCustomer(Long clerkId);
	
	public UserDto disableCustomer(Long clerkId);
	
}
