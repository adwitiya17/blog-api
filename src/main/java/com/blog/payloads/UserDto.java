package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

//user se jo lena hai wahi data lenge and directly expose kar sakte hai api
	
	
	private int id;
	@NotEmpty
	@Size(min=4,message = "Username must be of minimum of 4 character!!")
	private String name;
	
	@Email(message="Email address is not Valid!!")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message="It should be of range 3-10!!")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
