package br.com.moblyWs.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.moblyWs.entity.Veiculo;

@Component
public interface VeiculoService {

	Veiculo createOrUpdate(Veiculo usuario);
	
	Optional<Veiculo> findById(String id);
}
