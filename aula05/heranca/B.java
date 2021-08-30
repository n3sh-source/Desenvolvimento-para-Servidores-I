package com.si.heranca;

public class B {
	public void metodo1() {
		System.out.println("Metodo1");
	}
	
	public void metodo2() {
		System.out.println("Metodo2");
		metodo3(); //O private deixa
	}
	
	private void metodo3() {
		System.out.println("Metodo3");
	}
	
	void metodo7() {
		System.out.println("Metodo7");
	}
	
	protected void metodo8() {
		System.out.println("Metodo8");
	}
	
	public void metodo11(B b) {
		b.metodo3(); //o private deixa
	}
}
