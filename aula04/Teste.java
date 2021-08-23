package com.si;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		Bateria bat = new Bateria(3);
		bat.mostrarCarga();
		Celular cel = new Celular("Teste",bat);
		cel.receberMensagem();
		cel.ligar();
		cel.receberMensagem();
		cel.receberMensagem();
		cel.mostrarEstado();
		cel.ligar();
		cel.mostrarEstado();
		cel.receberMensagem();
		cel.recarregar();
		cel.ligar();
		cel.receberMensagem();
		cel.mostrarEstado();
		
		/** Endereco end = new Endereco("Rua teste",
				                    "Praia Grande",
				                    Estado.SP);
		Cliente cli = new Cliente("Teste", end);
		cli.mostrarCliente();
		**/
	}

}
