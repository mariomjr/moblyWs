package br.com.moblyWs.dto;

import br.com.moblyWs.enums.EnumTipoUsuario;

public class UsuarioCreateDto {

	private String nome;
	
	private String cpfCnpj;
	
	private String email;
	
	private String senha;
	
	private String telefone;
	
	private String numeroCnh;
	
	private Long dataNascimento;
	
	private EnumTipoUsuario tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNumeroCnh() {
		return numeroCnh;
	}

	public void setNumeroCnh(String numeroCnh) {
		this.numeroCnh = numeroCnh;
	}

	public Long getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EnumTipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoUsuario tipo) {
		this.tipo = tipo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
