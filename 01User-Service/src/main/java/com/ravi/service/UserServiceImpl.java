package com.ravi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ravi.entity.DepartmentDto;
import com.ravi.entity.ResponseDto;
import com.ravi.entity.User;
import com.ravi.entity.UserDto;
import com.ravi.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private RestTemplate resttemplate;

	@Override
	public User saveuser(User user) {

		return userrepo.save(user);
	}

	@Override
	public ResponseDto getuser(long userId) {
		ResponseDto responseDto = new ResponseDto();
		User user = userrepo.findById(userId).get();
		UserDto userDto = mapToUser(user);
		ResponseEntity<DepartmentDto> responseEntity = resttemplate
				.getForEntity("http://localhost:1999/getdepartment/" + user.getDepartmentId(), DepartmentDto.class);
		DepartmentDto departmentDto = responseEntity.getBody();

		System.out.println(responseEntity.getStatusCodeValue());
		responseDto.setUser(userDto);
		responseDto.setDepartment(departmentDto);
		return responseDto;
	}

	private UserDto mapToUser(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setEmail(user.getEmail());
		return userDto;
	}

}
