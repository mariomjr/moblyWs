package br.com.moblyWs.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moblyWs.dto.CartaoCreateDto;
import br.com.moblyWs.dto.CartaoViewDto;
import br.com.moblyWs.dto.UsuarioDto;
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
	public ResponseEntity<Response<UsuarioDto>> create(HttpServletRequest request, @RequestBody UsuarioDto usuario,
			BindingResult result){
		Response<UsuarioDto> response = new Response<UsuarioDto>();
		Usuario usuarioCreate = usuarioService.createOrUpdate(UsuarioMapper.INSTANCE.doDto(usuario));
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
//		Usuario usuarioCreate = usuarioService.createOrUpdate(usuario);
//		response.setData(usuarioCreate);
		return ResponseEntity.ok(response);
	}
}
