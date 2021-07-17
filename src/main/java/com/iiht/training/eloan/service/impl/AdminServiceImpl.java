package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.entity.Users;
import com.iiht.training.eloan.model.UserDto;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Override
	public UserDto registerClerk(UserDto userDto) {
		return null;

	}

	@Override
	public UserDto registerManager(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllClerks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto enableClerk(Long clerkId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto disableClerk(Long clerkId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto enableManager(Long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto disableManager(Long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto enableCustomer(Long clerkId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto disableCustomer(Long clerkId) {
		// TODO Auto-generated method stub
		return null;
	}

}
