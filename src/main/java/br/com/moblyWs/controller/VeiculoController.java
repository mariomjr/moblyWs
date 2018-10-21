package br.com.moblyWs.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moblyWs.dto.VeiculoDto;
import br.com.moblyWs.enums.EnumTipoVeiculo;
import br.com.moblyWs.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/veiculo")
@Api("Veículo")
public class VeiculoController {

	@PostMapping
	@ApiOperation("Criação do veículo")
	public ResponseEntity<Response<VeiculoDto>> create(HttpServletRequest request, @RequestBody VeiculoDto ticket,
			BindingResult result){
		Response<VeiculoDto> response = new Response<VeiculoDto>();
		
		return ResponseEntity.ok(response);
	}
	
	@PutMapping
	@ApiOperation("Update do veículo")
	public ResponseEntity<Response<VeiculoDto>> update(HttpServletRequest request, @RequestBody VeiculoDto ticket,
			BindingResult result){
		Response<VeiculoDto> response = new Response<VeiculoDto>();
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path="/tipos")
	@ApiOperation("Tipos de veículos")
	public ResponseEntity<Response<List<EnumTipoVeiculo>>> tipos(){
		Response<List<EnumTipoVeiculo>> response = new Response<List<EnumTipoVeiculo>>();
		response.setData(Arrays.asList(EnumTipoVeiculo.values()));
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path="/{lat}/{longe}/{raio}")
	@ApiOperation("Busca os carros próximos")
	public ResponseEntity<Response<List<VeiculoDto>>> getCarrosProximos(@PathVariable("lat") long lat, 
				@PathVariable("long") long longe, @PathVariable long raio){
		Response<List<VeiculoDto>> response = new Response<List<VeiculoDto>>();
		return ResponseEntity.ok(response);
	}
	
}
