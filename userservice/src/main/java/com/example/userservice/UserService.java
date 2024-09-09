package com.example.userservice;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	
	public User saveUser(User user);
	public User getUser(Long userid);		
	public ResponseDTO getResponseDTO(Long id);
	
}
