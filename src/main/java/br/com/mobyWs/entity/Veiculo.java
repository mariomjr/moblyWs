package br.com.mobyWs.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import br.com.mobyWs.enums.EnumTipoVeiculo;

public class Veiculo implements Serializable{

	private static final long serialVersionUID = 172527685474528178L;

	@Id
	private String id;
	
	private String placa;
	
	private String renavan;
	
	private Usuario proprietario;
	
	private EnumTipoVeiculo tipo;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Usuario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Usuario proprietario) {
		this.proprietario = proprietario;
	}

	public EnumTipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoVeiculo tipo) {
		this.tipo = tipo;
	}
	
}
