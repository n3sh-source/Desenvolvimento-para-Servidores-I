package com.si.heranca2;

public class Teste {

	public static void main(String[] args) {
		Quadrado q = new Quadrado(7);
		System.out.println(q.calcAreaQuadrado());
		System.out.println(q.calcPerimQuadrado());
		Retangulo r = new Retangulo(2,3);
		System.out.println(r.calcAreaRetangulo());
		System.out.println(r.calcPerimRetangulo());
		/*** Animal a = new Animal("Abstrato");
		a.comer();
		a.dormir();
		Cachorro c = new Cachorro("REX");
		c.comer();
		c.dormir();
		c.latir();
		Gato g = new Gato("Branco");
		g.comer();
		g.dormir();
		g.miar();
		***/
	}

}
