package com.si.heranca2;

public class Retangulo extends Quadrilatero{
	
	private double outroLado;

	public Retangulo(double lado, double outroLado) {
		super(lado);
		this.outroLado = outroLado;
	}
	
	public double calcAreaRetangulo() {
		return getLado()*outroLado;
	}
	
	public double calcPerimRetangulo() {
		return 2*(getLado() + outroLado);
	}
	
}
