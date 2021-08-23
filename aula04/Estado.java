package com.si;

public enum Estado {
	SP("São Paulo"), 
	RJ("Rio de Janeiro"), 
	ES("Espírito Santo"), 
	MG("Minas Gerais"), 
	SC("Santa Catarina"), 
	PR("Paraná"), 
	RS("Rio Grande do Sul"), 
	GO("Goiás"), 
	DF("Distrito Federal"), 
	MT("Mato Grosso"), 
	MS("Mato Grosso do Sul"), 
	BA("Bahia"),
	PE("Pernambuco"), 
	PB("Paraíba"), 
	AL("Alagoas"), 
	MA("Maranhão"), 
	PI("Piauí"), 
	CE("Ceará"), 
	SE("Sergipe"), 
	RN("Rio Grande do Norte"), 
	AP("Amapá"), 
	RO("Rondônia"), 
	RR("Roraíma"), 
	AC("Acre"),
	AM("Amazonas"), 
	PA("Pará"), 
	TO("Tocantins");
	
	private String nomeEstado;
	
	Estado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public String getNomeEstado() {
		return nomeEstado;
	}
}
