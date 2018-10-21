package br.com.moblyWs.dto;

import br.com.moblyWs.enums.EnumTipoVeiculo;

public class VeiculoDto {

	private String id;
	
	private String placa;
	
	private String renavan;
	
	private String descricao;
	
	private ObjectIdDto proprietario;
	
	private EnumTipoVeiculo tipo;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public ObjectIdDto getProprietario() {
		return proprietario;
	}

	public void setProprietario(ObjectIdDto proprietario) {
		this.proprietario = proprietario;
	}

	public EnumTipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoVeiculo tipo) {
		this.tipo = tipo;
	}

}
