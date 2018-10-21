package br.com.moblyWs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.moblyWs.entity.Veiculo;

public interface VeiculoRepository  extends MongoRepository<Veiculo, String>{

}
