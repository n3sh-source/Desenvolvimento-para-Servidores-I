package com.sql;

public class Teste {

	public static void main(String[] args) {
		Parser p = new Parser();
		Cliente c = new Cliente("Teste",20,"1105640");
		System.out.println(p.gerarSQL(c));
		Produto pr = new Produto("Caneta",1.50);
		System.out.println(p.gerarSQL(pr));
	}

}
