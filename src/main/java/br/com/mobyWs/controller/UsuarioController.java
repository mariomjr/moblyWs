package br.com.mobyWs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mobyWs.entity.Cartao;
import br.com.mobyWs.entity.Usuario;
import br.com.mobyWs.response.Response;
import br.com.mobyWs.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/usuario")
@Api("Usuário")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;

	@PostMapping
	@ApiOperation("Criação ou update do usuário")
	public ResponseEntity<Response<Usuario>> createUpdate(HttpServletRequest request, @RequestBody Usuario usuario,
			BindingResult result){
		Response<Usuario> response = new Response<Usuario>();
		Usuario usuarioCreate = usuarioService.createOrUpdate(usuario);
		response.setData(usuarioCreate);
		return ResponseEntity.ok(response);
	}

	@PostMapping(value="/cartao")
	@ApiOperation("Cadastro de cartões")
	public ResponseEntity<Response<Cartao>> cadastroCartao(HttpServletRequest request, @RequestBody Cartao cartao,
			BindingResult result){
		Response<Cartao> response = new Response<Cartao>();
//		Usuario usuarioCreate = usuarioService.createOrUpdate(usuario);
//		response.setData(usuarioCreate);
		return ResponseEntity.ok(response);
	}
}
