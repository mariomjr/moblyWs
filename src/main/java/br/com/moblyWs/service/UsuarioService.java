package br.com.moblyWs.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.moblyWs.entity.Usuario;

@Component
public interface UsuarioService {

	Usuario createOrUpdate(Usuario usuario);
	
	Optional<Usuario> findById(String id);
}
