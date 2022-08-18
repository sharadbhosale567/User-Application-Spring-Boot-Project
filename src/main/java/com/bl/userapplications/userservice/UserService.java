package com.bl.userapplications.userservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.userapplications.Utility.Response;
import com.bl.userapplications.model.User;
import com.bl.userapplications.model.UserDto;
import com.bl.userapplications.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private Response response;
	
	
	
	public Response getAllUsers(){
		return new Response("All data", 200, userRepository.findAll());
	}
	
	public Response addUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.save(user);
		System.out.println(user.toString());
			return new Response("New User added successfully", 100, user);
	}
	
	public Response getUserById(int id) {
		return new Response("found user by given id", 100, userRepository.findById(id));
	}
	
	public Response updateUser(int id, UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.save(user);
		return new Response("updated user successfully", 100, user);
	}
	
	public Response deleteUser(int id) {
		return new Response("user deleted", 100, userRepository.deleteById(id));
	
	}

}