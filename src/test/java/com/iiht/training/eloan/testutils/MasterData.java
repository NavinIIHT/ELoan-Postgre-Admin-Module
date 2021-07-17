package com.iiht.training.eloan.testutils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.iiht.training.eloan.model.UserDto;

public class MasterData {

	public static UserDto getUserDto() {
		UserDto userDto = new UserDto();
		userDto.setFirstName("First");
		userDto.setLastName("Last");
		userDto.setEmail("first@mail.com");
		userDto.setMobile("1234567890");
		return userDto;
	}
	
	
	public static List<UserDto> getUserDtoList() {
		List<UserDto> userDtos = new ArrayList<UserDto>();
		UserDto userDto = new UserDto();
		userDto.setId(1L);
		userDto.setFirstName("First");
		userDto.setLastName("Last");
		userDto.setEmail("first@mail.com");
		userDto.setMobile("1234567890");
		userDtos.add(userDto);
		userDto = new UserDto();
		userDto.setId(2L);
		userDto.setFirstName("Second");
		userDto.setLastName("Last");
		userDto.setEmail("second@mail.com");
		userDto.setMobile("1234567890");
		userDtos.add(userDto);
		return userDtos;
	}
	
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        final ObjectMapper mapper = new ObjectMapper();
	        final String jsonContent = mapper.writeValueAsString(obj);
	        return jsonContent;
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}  
}
