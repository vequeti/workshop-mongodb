package com.viniciusv.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusv.workshopmongo.dto.UserDTO;
import com.viniciusv.workshopmongo.entities.User;
import com.viniciusv.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> result = userService.findAll();
		return ResponseEntity.ok().body(result.stream().map(x -> new UserDTO(x)).toList());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id){
		User user = userService.findById(id);
		return ResponseEntity.ok().body(new UserDTO(user)); 
	}
}
