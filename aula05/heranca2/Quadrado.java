package com.si.heranca2;

public class Quadrado extends Quadrilatero{

	public Quadrado(double lado) {
		super(lado);
	}
	
	public double calcAreaQuadrado() {
		return getLado()*getLado();
	}
	
	public double calcPerimQuadrado() {
		return getLado()*4;
	}

}
