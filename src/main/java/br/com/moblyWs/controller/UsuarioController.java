package br.com.moblyWs.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moblyWs.dto.AvaliacaoCreateDto;
import br.com.moblyWs.dto.CartaoCreateDto;
import br.com.moblyWs.dto.CartaoViewDto;
import br.com.moblyWs.dto.UsuarioCreateDto;
import br.com.moblyWs.dto.UsuarioDto;
import br.com.moblyWs.dto.VeiculoDto;
import br.com.moblyWs.entity.Usuario;
import br.com.moblyWs.mapper.UsuarioMapper;
import br.com.moblyWs.response.Response;
import br.com.moblyWs.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/usuario")
@Api("Usuário")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;

	@PostMapping
	@ApiOperation("Criação do usuário")
	public ResponseEntity<Response<UsuarioDto>> create(HttpServletRequest request, @RequestBody UsuarioCreateDto usuario,
			BindingResult result){
		Response<UsuarioDto> response = new Response<UsuarioDto>();
		Usuario usuarioCreate = usuarioService.createOrUpdate(UsuarioMapper.INSTANCE.doCreateDto(usuario));
		response.setData(UsuarioMapper.INSTANCE.paraDto(usuarioCreate));
		return ResponseEntity.ok(response);
	}
	
	@PutMapping
	@ApiOperation("Update do usuário")
	public ResponseEntity<Response<UsuarioDto>> update(HttpServletRequest request, @RequestBody UsuarioDto usuarioDto,
			BindingResult result){
		Response<UsuarioDto> response = new Response<UsuarioDto>();
		Optional<Usuario> usuario = usuarioService.findById(usuarioDto.getId());
		if(usuario.isPresent()) {
			UsuarioMapper.INSTANCE.atualizar(usuarioDto,usuario.get());
			usuarioService.createOrUpdate(usuario.get());
			response.setData(UsuarioMapper.INSTANCE.paraDto(usuario.get()));
		}
		return ResponseEntity.ok(response);
	}

	@PostMapping(value="/cartao")
	@ApiOperation("Cadastro de cartões")
	public ResponseEntity<Response<CartaoViewDto>> cadastroCartao(HttpServletRequest request, @RequestBody CartaoCreateDto cartaoDto,
			BindingResult result){
		Response<CartaoViewDto> response = new Response<CartaoViewDto>();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path="/veiculos")
	@ApiOperation("Busca os veículos do usuário")
	public ResponseEntity<Response<List<VeiculoDto>>> getVeiculos(@PathVariable("idUsuario") String idUsuario){
		Response<List<VeiculoDto>> response = new Response<List<VeiculoDto>>();
		return ResponseEntity.ok(response);
	}
	
	@PostMapping(value="/avaliar")
	@ApiOperation("Realiza avaliação")
	public ResponseEntity<Response<String>> avaliar(HttpServletRequest request, @RequestBody AvaliacaoCreateDto avaliacaoCreateDto,
			BindingResult result){
		Response<String> response = new Response<String>();
		return ResponseEntity.ok(response);
	}
}
