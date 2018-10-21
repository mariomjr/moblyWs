package br.com.moblyWs.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moblyWs.entity.Veiculo;
import br.com.moblyWs.enums.EnumTipoVeiculo;
import br.com.moblyWs.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/veiculo")
@Api("Veículo")
public class VeiculoController {

	@PostMapping
	@ApiOperation("Criação ou update")
	public ResponseEntity<Response<Veiculo>> createUpdate(HttpServletRequest request, @RequestBody Veiculo ticket,
			BindingResult result){
		Response<Veiculo> response = new Response<Veiculo>();
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path="/tipos")
	@ApiOperation("Tipos de veículos")
	public ResponseEntity<Response<List<EnumTipoVeiculo>>> tipos(){
		Response<List<EnumTipoVeiculo>> response = new Response<List<EnumTipoVeiculo>>();
		response.setData(Arrays.asList(EnumTipoVeiculo.values()));
		return ResponseEntity.ok(response);
	}
}
