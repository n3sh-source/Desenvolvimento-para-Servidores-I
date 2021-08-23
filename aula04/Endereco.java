package com.si;

public class Endereco {
	
	private String logradouro, cidade;
	private Estado estado;
	
	public Endereco(String logradouro, 
			        String cidade, 
			        Estado estado) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void mostrarEndereco() {
		System.out.println("Logadouro: " + logradouro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado.getNomeEstado());
	}
	
}
