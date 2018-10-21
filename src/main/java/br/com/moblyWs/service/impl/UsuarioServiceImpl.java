package br.com.moblyWs.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moblyWs.entity.Usuario;
import br.com.moblyWs.repository.UsuarioRepository;
import br.com.moblyWs.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario createOrUpdate(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findById(String id) {
		return this.usuarioRepository.findById(id);
	}

}
