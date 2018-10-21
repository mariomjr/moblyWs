package br.com.moblyWs.util;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class UtilString {
	
	/**
	 * Adiciona zeros Ã  esquerda em um nÃºmero atÃ© se atingir um determinado
	 * tamanho de String.
	 *
	 * @param numero      o nÃºmero a ser transformado em uma String de um
	 *                    determinado tamanho.
	 * @param tamanhoFixo o tamanho da String a ser retornada.
	 * @return o numero como uma String com o tamanho desejado.
	 */
	public static String completarComZerosAEsquerda(long numero, int tamanhoFixo) {
		return String.format("%0" + tamanhoFixo + "d", numero);
	}

	/**
	 * Normaliza uma string, de forma que o resultado contenha apenas caracteres
	 * ASCII. Por exemplo: JoÃ£o AssunÃ§Ã£o se torna Joao Assuncao. Obs.: Null
	 * retorna string vazia.
	 *
	 * @param string a string a ser normalizada.
	 * @return a string normalizada.
	 */
	public static String normalizar(String string) {
		if (string == null) {
			return "";
		}
		return Normalizer.normalize(string, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	/**
	 * Normaliza uma string e depois a converte para upper case.
	 *
	 * @param string a string a ser padronizada.
	 * @return a string padronizada.
	 */
	public static String padronizar(String string) {
		return normalizar(string).toUpperCase();
	}

	/**
	 * Verifica se uma string Ã© null ou vazia (string.trim().isEmpty()).
	 *
	 * @param string a string a ser verificada.
	 * @return true se for vazia ou null.
	 */
	public static boolean ehNullOuVazio(String string) {
		return string == null || string.trim().isEmpty();
	}

	/**
	 * Converte o primeiro caracter de uma string para minÃºsculo.
	 *
	 * @param string a string a ser convertida.
	 * @return a string convertida.
	 */
	public static String converterPrimeiraLetraParaMinusculo(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		String resposta = string.substring(0, 1).toLowerCase();
		if (string.length() > 1) {
			return resposta + string.substring(1);
		} else {
			return resposta;
		}
	}

	/**
	 * Converte o primeiro caracter de uma string para maiÃºsculo.
	 *
	 * @param string a string a ser convertida.
	 * @return a string convertida.
	 */
	public static String converterPrimeiraLetraParaMaiusculo(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		String resposta = string.substring(0, 1).toUpperCase();
		if (string.length() > 1) {
			return resposta + string.substring(1);
		} else {
			return resposta;
		}
	}

	/**
	 * Remove os espaÃ§os duplicados em uma string.
	 *
	 * @param string a string a ser melhorada.
	 * @return a string melhorada.
	 */
	public static String removerEspacosDuplicados(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		return string.replaceAll(" +", " ");
	}

	/**
	 * Converte todas as palavras iniciais de uma String para maiÃºsculo. Ex.: TESTE
	 * TESTE TESTE vira Teste Teste Teste. EspaÃ§os duplicados sÃ£o removidos.
	 *
	 * @param string a string a ser tratada.
	 * @return a string tratada.
	 */
	public static String converterCaixaApenasIniciaisMaiusculo(String string) {
		if (string == null) {
			return "";
		}
		String stringMinusculo = string.toLowerCase();
		List<String> palavras = new ArrayList<>();
		for (String palavra : stringMinusculo.split(" +")) {
			palavras.add(converterPrimeiraLetraParaMaiusculo(palavra));
		}
		return String.join(" ", palavras);
	}

	/**
	 * Remove todos os caracteres de uma String que nÃ£o sejam dÃ­gitos de 0 a 9.
	 *
	 * @param string a string a ser tratada.
	 * @return a string tratada.
	 */
	public static String manterApenasNumeros(String string) {
		if (string == null) {
			return "";
		}
		return string.replaceAll("[\\D]+", "");
	}
}
