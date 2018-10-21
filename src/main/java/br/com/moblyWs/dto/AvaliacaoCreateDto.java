package br.com.moblyWs.dto;

public class AvaliacaoCreateDto {
	
	private String descricao;
	
	private Integer avaliacao;
	
	private ObjectIdDto avaliado;
	
	private ObjectIdDto veiculo;

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

	public ObjectIdDto getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(ObjectIdDto avaliado) {
		this.avaliado = avaliado;
	}

	public ObjectIdDto getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(ObjectIdDto veiculo) {
		this.veiculo = veiculo;
	}
}
