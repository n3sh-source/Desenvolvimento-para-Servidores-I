package com.si;

public enum Estado {
	SP("S�o Paulo"), 
	RJ("Rio de Janeiro"), 
	ES("Esp�rito Santo"), 
	MG("Minas Gerais"), 
	SC("Santa Catarina"), 
	PR("Paran�"), 
	RS("Rio Grande do Sul"), 
	GO("Goi�s"), 
	DF("Distrito Federal"), 
	MT("Mato Grosso"), 
	MS("Mato Grosso do Sul"), 
	BA("Bahia"),
	PE("Pernambuco"), 
	PB("Para�ba"), 
	AL("Alagoas"), 
	MA("Maranh�o"), 
	PI("Piau�"), 
	CE("Cear�"), 
	SE("Sergipe"), 
	RN("Rio Grande do Norte"), 
	AP("Amap�"), 
	RO("Rond�nia"), 
	RR("Rora�ma"), 
	AC("Acre"),
	AM("Amazonas"), 
	PA("Par�"), 
	TO("Tocantins");
	
	private String nomeEstado;
	
	Estado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public String getNomeEstado() {
		return nomeEstado;
	}
}
