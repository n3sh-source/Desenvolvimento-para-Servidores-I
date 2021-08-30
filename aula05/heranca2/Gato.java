package com.si.heranca2;

public class Gato extends Animal{

	public Gato(String nome) {
		super(nome);
	}
	
	public void miar() {
		System.out.println(getNome() + ": MIAUUU");
	}
	
}
