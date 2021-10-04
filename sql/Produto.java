package com.sql;

import java.util.HashMap;

public class Produto implements Tabela{
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String getNomeTabela() {
		return "produto";
	}

	@Override
	public HashMap<String, Object> getValores() {
		HashMap<String,Object> hm = new HashMap<String,Object>();
		hm.put("nm_produto", nome);
		hm.put("vl_preco", preco);
		return hm;
	}

}
