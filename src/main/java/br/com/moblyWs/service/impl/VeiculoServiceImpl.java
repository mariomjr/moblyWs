package br.com.moblyWs.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moblyWs.entity.Veiculo;
import br.com.moblyWs.repository.VeiculoRepository;
import br.com.moblyWs.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService{

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Override
	public Veiculo createOrUpdate(Veiculo veiculo) {
		return this.veiculoRepository.save(veiculo);
	}

	@Override
	public Optional<Veiculo> findById(String id) {
		return this.veiculoRepository.findById(id);
	}

}
