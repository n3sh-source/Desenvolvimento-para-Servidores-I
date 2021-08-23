package com.si;

public class Cliente {
	
	//Cliente HAS-A Endereco
	private String nome;
	private Endereco endereco;
	
	public Cliente(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void mostrarCliente() {
		System.out.println("Nome: " + nome);
		endereco.mostrarEndereco();
	}
	
}
