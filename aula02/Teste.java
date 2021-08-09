package prj_aula02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		//Interação com o user
		Scanner s = new Scanner(System.in);
								//Entrada do teclado
		System.out.println("Base: ");
		double base = s.nextDouble();
		
		System.out.println("Altura: ");
		double altura = s.nextDouble();
		
		/*Contador k = new Contador();
		
		k.incrementar();
		k.zerar();
		k.incrementar();
		k.decrementar();
		k.incrementar();
		k.mostrar();
		*/
		
		Retangulo r = new Retangulo(base,altura);
		r.mostarMedidas();
		
		s.close();
		
		Agenda a = new Agenda(Dia.SEGUNDA);
		a.mostarTarefa();
		System.out.println(Dia.SABADO.traducao);
	}

}
