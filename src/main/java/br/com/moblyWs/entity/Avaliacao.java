package br.com.moblyWs.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Avaliacao {

	@Id
	private String id;
	
	private String descricao;
	
	private Integer avaliacao;
	
	@DBRef(lazy=true)
	private Usuario avaliador;
	
	@DBRef(lazy=true)
	private Usuario avaliado;
	
	@DBRef(lazy=true)
	private Veiculo veiculo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Usuario getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Usuario avaliador) {
		this.avaliador = avaliador;
	}

	public Usuario getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(Usuario avaliado) {
		this.avaliado = avaliado;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
}
