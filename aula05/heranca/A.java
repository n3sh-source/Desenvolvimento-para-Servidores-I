package com.si.heranca;

public class A extends B{
	
	public void metodo4() {
		System.out.println("Metodo4");
		metodo5();
	}
	
	private void metodo5() {
		System.out.println("Metodo5");
	}
	
	public void metodo9(B b) {
		b.metodo1();
		b.metodo2();
		b.metodo7();
		b.metodo8();
	}
	
}
