package com.si.heranca2;

public class Animal {
	
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void dormir() {
		System.out.println(nome + ": ZZZzzzz");
	}
	
	public void comer() {
		System.out.println(nome + " comeu...");
	}
}
