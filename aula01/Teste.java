package prj_aula01;
public class Teste {

	public static void main(String[] args) {
		//c eh uma variável (objeto) do
		// tipo Cachorro.
		
		//O objeto é chamado de c no main
		
		//Na classe Cachorro ele é chamado de this (objeto chamador)
		
		//Por exemplo, c.latir() foi chamado em Teste. Na Classe Cachorro o objeto c é chamado de this.
		Cachorro c = new Cachorro();
		c.nome = "BIDU";
		c.raca = "SRD";
		c.latir();
		c.mostrarRaca();
		
		//Como debugar
		//Setar o breakpoint (bolinha)
		//F11 - começa
		//F6 - pula linha
		//F5 - entra em método
		
		Cachorro d = new Cachorro();
		d.nome = "REX";
		d.raca = "Pitbull";
		d.latir();
		d.mostrarRaca();
	}

}
