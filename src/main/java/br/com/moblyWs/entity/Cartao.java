package br.com.moblyWs.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Cartao implements Serializable{
	
	private static final long serialVersionUID = -4766204895450638976L;

	@Id
	private String id;
	
	private String nome;
	
	private String numeroCartao;
	
	private Integer mesValidade;
	
	private Integer anoValidade;
	
	private Integer codigoSeguranca;
	
	@DBRef(lazy=true)
	private Usuario usuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Integer getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}

	public Integer getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}

	public Integer getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(Integer codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
