package br.com.mobyWs.util;

import java.util.regex.Pattern;

public class UtilMascara {

	private static final Pattern patternCPF = Pattern.compile(Regex.CPF_APENAS_NUMEROS);
    private static final int[]   pesoCPF    = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static final Pattern patternCNPJ = Pattern.compile(Regex.CNPJ_APENAS_NUMEROS);
    private static final int[]   pesoCNPJ    = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

	/**
	 * Aplica a mÃ¡scara de CEP em uma String contendo apenas seus nÃºmeros.
	 *
	 * @param cep o cep contendo apenas nÃºmeros.
	 * @return o cep formatado.
	 */
	public static String formatarCEP(String cep) {
		if (cep != null && cep.matches(Regex.CEP_APENAS_NUMEROS)) {
			return cep.replaceFirst("([0-9]{2})([0-9]{3})([0-9]{3})", "$1.$2-$3");
		} else {
			throw new IllegalArgumentException("CEP invÃ¡lido!");
		}
	}

	/**
	 * Aplica a mÃ¡scara de telefone em uma String contendo apenas seus nÃºmeros.
	 *
	 * @param telefone o telefone contendo apenas nÃºmeros.
	 * @return o telefone formatado.
	 */
	public static String formatarTelefone(String telefone) {
		if (telefone != null && telefone.matches(Regex.TELEFONE_APENAS_NUMEROS)) {
			return telefone.replaceFirst("([0-9]{2})([0-9]{4,5})([0-9]{4})", "($1) $2-$3");
		} else {
			throw new IllegalArgumentException("Telefone invÃ¡lido!");
		}
	}

	/**
	 * Aplica a mÃ¡scara de CPNJ em uma String contendo apenas seus nÃºmeros.
	 *
	 * @param cnpj o cnpj contendo apenas nÃºmeros.
	 * @return o cnpj formatado.
	 */
	public static String formatarCNPJ(String cnpj) {
		if (cnpj != null && cnpj.matches(Regex.CNPJ_APENAS_NUMEROS)) {
			return cnpj.replaceFirst("([0-9]{2})([0-9]{3})([0-9]{3})([0-9]{4})([0-9]{2})", "$1.$2.$3/$4-$5");
		} else {
			throw new IllegalArgumentException("CNPJ invÃ¡lido!");
		}
	}

	/**
	 * Aplica a mÃ¡scara de CPF em uma String contendo apenas seus nÃºmeros.
	 *
	 * @param cpf o cpf contendo apenas nÃºmeros.
	 * @return o cpf formatado.
	 */
	public static String formatarCPF(String cpf) {
		if (cpf != null && cpf.matches(Regex.CPF_APENAS_NUMEROS)) {
			return cpf.replaceFirst("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1.$2.$3-$4");
		} else {
			throw new IllegalArgumentException("CPF invÃ¡lido!");
		}
	}

	/**
	 * Aplica a mÃ¡scara de CPF ou CNPJ em uma String contendo apenas os nÃºmeros.
	 *
	 * @param cnp o cnp contendo apenas nÃºmeros.
	 * @return o cnp formatado.
	 */
	public static String formatarCNP(String cnp) {
		if (cnp != null && cnp.matches(Regex.CPF_APENAS_NUMEROS)) {
			return formatarCPF(cnp);
		} else if (cnp != null && cnp.matches(Regex.CNPJ_APENAS_NUMEROS)) {
			return formatarCNPJ(cnp);
		} else {
			throw new IllegalArgumentException("CNP inválido!");
		}
	}

	/**
	 * Valida se uma string representa um CPF.
	 *
	 * @param cpf o cpf.
	 * @return true se representa, false se nÃ£o representa.
	 */
	public static boolean validarCpf(String cpf) {
		if (cpf == null) {
			return false;
		}

		if (!patternCPF.matcher(cpf).matches()) {
			return false;
		}

		if (cpf.matches("(\\d)\\1+")) {
			return false;
		}

		Integer digitoEsperado1 = calcularDigitoEsperadoCnp(cpf.substring(0, 9), pesoCPF);
		Integer digitoEsperado2 = calcularDigitoEsperadoCnp(cpf.substring(0, 9) + digitoEsperado1, pesoCPF);
		return cpf.equals(cpf.substring(0, 9) + digitoEsperado1.toString() + digitoEsperado2.toString());
	}

	/**
	 * Valida se uma string representa um CNPJ.
	 *
	 * @param cnpj o cnpj.
	 * @return true se representa, false se nÃ£o representa.
	 */
	public static boolean validarCnpj(String cnpj) {
		if (cnpj == null) {
			return false;
		}

		if (!patternCNPJ.matcher(cnpj).matches()) {
			return false;
		}

		if (cnpj.matches("(\\d)\\1+")) {
			return false;
		}

		Integer digitoEsperado1 = calcularDigitoEsperadoCnp(cnpj.substring(0, 12), pesoCNPJ);
		Integer digitoEsperado2 = calcularDigitoEsperadoCnp(cnpj.substring(0, 12) + digitoEsperado1, pesoCNPJ);
		return cnpj.equals(cnpj.substring(0, 12) + digitoEsperado1.toString() + digitoEsperado2.toString());
	}

	private static int calcularDigitoEsperadoCnp(String cnp, int[] peso) {
		int soma = 0;
		for (int indice = cnp.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(cnp.substring(indice, indice + 1));
			soma += digito * peso[peso.length - cnp.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}
}
