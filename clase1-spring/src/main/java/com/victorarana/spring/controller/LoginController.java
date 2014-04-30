package com.victorarana.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.victorarana.spring.service.UsuarioService;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/login")
	public String mostrarLogin(){
		return "login";
	}
	
	@RequestMapping(value="/autentificar", method=RequestMethod.POST)
	public String validarUsuario(String nombre, String password, Model modelo){
		String vista = null;
		if(usuarioService.validaUsuario(nombre, password)){
			modelo.addAttribute("nombre", nombre);
			vista = "bienvenido";
		}
		else{
			vista = "login";
		}				
		return vista;
	}
}