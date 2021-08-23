package com.si;

public class Celular {
	//Celular HAS-A Bateria
	private String nome;
	private Bateria bateria;
	private boolean ligado;
	
	public Celular(String nome, Bateria bateria) {
		this.nome = nome;
		this.bateria = bateria;
	}
	
	public void ligar() {
		if(!bateria.estaVazio()) {
			ligado = true;
			System.out.println("Bem-vindo " + nome);
			bateria.gastar();
			bateria.gastar();
		}
		estarSemBateria();
	}
	
	public void desligar() {
		if(!bateria.estaVazio())
			System.out.println("Tchau!");
		ligado = false;
	}
	
	public void receberMensagem() {
		if(!bateria.estaVazio() && ligado) {
			System.out.println("Recebendo mensagens ...");
			bateria.gastar();
		}
		estarSemBateria();
	}
	
	public void recarregar() throws InterruptedException {
		while(!bateria.estaCheio()) {
			bateria.recarregar();
			bateria.mostrarCarga();
			Thread.sleep(100);
		}
	}
	
	private void estarSemBateria() {
		if(bateria.estaVazio())
			ligado = false;
	}
	
	public void mostrarEstado() {
		System.out.println(nome);
		bateria.mostrarCarga();
		System.out.println(ligado);
	}
	
}
