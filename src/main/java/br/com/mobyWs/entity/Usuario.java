package br.com.mobyWs.entity;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import br.com.mobyWs.enums.EnumTipoUsuario;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 8646918060853291092L;

	@Id
	private String id;
	
	private String nome;
	
	private String cpfCnpj;
	
	private String email;
	
	private String telefone;
	
	private String numeroCnh;
	
	private LocalDate dataNascimento;
	
	private EnumTipoUsuario tipo;
	
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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public EnumTipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoUsuario tipo) {
		this.tipo = tipo;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
