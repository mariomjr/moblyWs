package br.com.moblyWs.util;

public interface Regex {
	
	int TAMANHO_CEP_APENAS_NUMEROS = 8;

    String CEP_APENAS_NUMEROS = "[0-9]{" + TAMANHO_CEP_APENAS_NUMEROS + "}";

    int TAMANHO_CNPJ_APENAS_NUMEROS = 14;

    String CNPJ_APENAS_NUMEROS = "[0-9]{" + TAMANHO_CNPJ_APENAS_NUMEROS + "}";

    int TAMANHO_CPF_APENAS_NUMEROS = 11;

    String CPF_APENAS_NUMEROS = "[0-9]{" + TAMANHO_CPF_APENAS_NUMEROS + "}";

    int TAMANHO_MAX_TELEFONE_APENAS_NUMEROS = 11;

    String CNP_APENAS_NUMEROS = "[0-9]{" + TAMANHO_CNPJ_APENAS_NUMEROS + "}|[0-9]{" + TAMANHO_CPF_APENAS_NUMEROS + "}";

    String TELEFONE_APENAS_NUMEROS = "[0-9]{10,11}";

    /**
     * @see <a href="http://emailregex.com/">http://emailregex.com/</a>
     */
    String EMAIL = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"" +
            "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])" +
            "*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:" +
            "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:" +
            "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
}
