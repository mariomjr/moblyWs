package br.com.mobyWs.dto;

public class CartaoCreateDto {
	
	private String nome;
	
	private String numeroCartao;
	
	private Integer mesValidade;
	
	private Integer anoValidade;
	
	private Integer codigoSeguranca;

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
}
