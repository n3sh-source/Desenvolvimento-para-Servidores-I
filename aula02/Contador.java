package prj_aula02;

public class Contador {
	
	int quantidade;
	
	void incrementar() {
		quantidade++;
	}
	
	void decrementar() {
		if(quantidade > 0) {
			quantidade--;
		}else {
			System.out.println("Erro");
		}
	}
	
	void mostrar() {
		System.out.println(quantidade+" pessoas");
	}
	
	void zerar() {
		quantidade = 0;
	}
	
}
