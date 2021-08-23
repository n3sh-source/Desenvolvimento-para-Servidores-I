package com.si.hasmany;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private ArrayList<Avaliacao> avals;
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.avals = new ArrayList<Avaliacao>();
	}
	
	public void cadastrar(Avaliacao a) {
		//metodo add eh do ArrayList
		avals.add(a);
	}
	
	public void listarAprovados() {
		//for(int i=0; i < avals.size(); i++) {
		//	if(avals.get(i).estaAprovado())
		//		avals.get(i).mostrarDados();
		//}
		System.out.println("Disciplina: " + nome);
		for(Avaliacao av : avals) {
			if(av.estaAprovado())
				av.mostrarDados();
		}
	}
	
	public void mostrarMediaP1() {
		double soma = 0;
		System.out.println("Disciplina: " + nome);
		for(Avaliacao av : avals) {
			soma = soma + av.getP1();
		}
		System.out.println("Media da P1: " + (soma/avals.size()));
	}
	
}
