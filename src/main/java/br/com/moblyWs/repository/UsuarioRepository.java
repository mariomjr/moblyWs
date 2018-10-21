package br.com.moblyWs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.moblyWs.entity.Usuario;

public interface UsuarioRepository  extends MongoRepository<Usuario, String>{

}
