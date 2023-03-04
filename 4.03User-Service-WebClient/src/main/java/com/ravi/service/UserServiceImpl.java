package com.ravi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ravi.dto.DepartmentDto;
import com.ravi.dto.ResponseDto;
import com.ravi.dto.UserDto;
import com.ravi.entity.User;
import com.ravi.repository.UserRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

// All arg constructor we donot wont to Need @autoWire Annotation

	private UserRepository userRepository;
	//by using resttemplate we are using ApiClient
	//private RestTemplate restTemplate;

	private WebClient webClient;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public ResponseDto getUser(Long userId) {
		ResponseDto responseDto = new ResponseDto();
		User user = userRepository.findById(userId).get();
		UserDto userDto = mappedByUser(user);

		String getDeptUrl="http://DEPARTMENT-SERVICE-CLIENT/api/departments/";
		
		//ResponseEntity<DepartmentDto> deptDto=restTemplate.getForEntity(getDeptUrl, DepartmentDto.class);
		//DepartmentDto departmentDto = deptDto.getBody();
		DepartmentDto departmentDto= webClient.get().uri(getDeptUrl).retrieve().bodyToMono(DepartmentDto.class).block();
		responseDto.setUser(userDto);
		responseDto.setDepartment(departmentDto);

		return responseDto;
	}

	private UserDto mappedByUser(User user) {
		UserDto mapUesrDto = new UserDto();
		mapUesrDto.setId(user.getId());
		mapUesrDto.setFirstName(user.getFirstName());
		mapUesrDto.setLastName(user.getLastName());
		mapUesrDto.setEmail(user.getEmail());
		return mapUesrDto;
	}
	
	
}