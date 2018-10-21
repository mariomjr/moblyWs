package br.com.mobyWs.enums;

public enum EnumTipoUsuario {
	F("Física"), J("Jurídica");
	
	private String label;
	
	private EnumTipoUsuario(String label) {
		this.label =  label;
	}
	
	public String getLabel() {
		return label;
	}
}
