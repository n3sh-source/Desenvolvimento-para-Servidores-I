package com.sql;

import java.util.HashMap;

public class Cliente implements Tabela{
	
	private String nome;
	private int idade;
	private String cep;
	
	public Cliente(String nome, int idade, String cep) {
		this.nome = nome;
		this.idade = idade;
		this.cep = cep;
	}
	
	@Override
	public String getNomeTabela() {
		return "cliente";
	}

	@Override
	public HashMap<String, Object> getValores() {
		HashMap<String,Object> hm = new HashMap<String,Object>();
		hm.put("nm_cliente", nome);
		hm.put("qt_idade", idade);
		hm.put("cep", cep);
		return hm;
	}

}
