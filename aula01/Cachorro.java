package prj_aula01;
//CamelCase no nome das classes.
public class Cachorro {

	String nome, raca;
	
	//Nao possui um tipo de retorno. Ele realiza
	//uma açao
	
	//Se em main o objeto d chama latir(), temos
	// que this = d.
	
	void latir() {
		System.out.println(this.nome + ": AU AU");
	}
	
	//O THIS É OPCIONAL
	void mostrarRaca() {
		System.out.println(raca);
	}
	
}