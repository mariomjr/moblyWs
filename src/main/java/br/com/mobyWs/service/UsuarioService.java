package br.com.mobyWs.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.mobyWs.entity.Usuario;

@Component
public interface UsuarioService {

	Usuario createOrUpdate(Usuario usuario);
	
	Optional<Usuario> findById(String id);
}
