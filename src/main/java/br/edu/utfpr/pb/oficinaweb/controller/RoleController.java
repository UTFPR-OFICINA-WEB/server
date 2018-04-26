package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.enumeration.Role;

@RestController
@RequestMapping("roles")
public class RoleController {
	
	@GetMapping
	public Role[] getRoles(){
		return Role.values();
	}
	

}
