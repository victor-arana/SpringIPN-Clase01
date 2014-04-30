package com.victorarana.spring.service;

import org.springframework.stereotype.Component;

@Component
public class UsuarioServiceImpl implements UsuarioService {
	/* (non-Javadoc)
	 * @see com.victorarana.spring.service.UsuarioService#validaUsuario(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean validaUsuario(String nombre, String password){		
		return nombre.equals("juanito") && password.equals("123"); 
	}
}
