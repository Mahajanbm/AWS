package com.example.userservice;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class UserServiceImpl implements UserService {
	private	UserRepository userRepository;
	private RestTemplate restTemplate;


	@Override
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User getUser(Long userid) {
		return	userRepository.findById(userid).get();


	}

	@Override
	public ResponseDTO getResponseDTO(Long id) {

		ResponseDTO responseDto=new ResponseDTO();
		User user = userRepository.findById(id).get();
		UserDTO u1=fetching(user);
		ResponseEntity<DeptDTO> deptEntity=restTemplate.getForEntity("http://localhost:9394/dept/1",DeptDTO.class);
		  DeptDTO departmentDto = deptEntity.getBody();

	      //  System.out.println(de.getStatusCode());

	        responseDto.setUserDTO(u1);
	        responseDto.setDeptDTO(departmentDto);

	        return responseDto;
	}
	private UserDTO fetching(User user)
	{
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getId());
		userDto.setuName(user.getuName());
		userDto.setuCity(user.getuCity());
		
		return userDto;

		
	}

}
