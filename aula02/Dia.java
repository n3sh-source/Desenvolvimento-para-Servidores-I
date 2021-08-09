package prj_aula02;

public enum Dia {
	DOMINGO("Sunday"),
	SEGUNDA("Monday"),
	TERÇA("Tuesday"),
	QUARTA("Wednesday"),
	QUINTA("Thursday"),
	SEXTA("Friday"),
	SABADO("Saturday");
	
	String traducao;
	
	Dia(String traducao){
		this.traducao = traducao;
	}
}
