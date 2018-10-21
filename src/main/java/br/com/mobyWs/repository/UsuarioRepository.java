package br.com.mobyWs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.mobyWs.entity.Usuario;

public interface UsuarioRepository  extends MongoRepository<Usuario, String>{

}
