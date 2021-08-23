package com.si;

public class Bateria {
	
	private int carga;
	
	public Bateria(int carga) {
		this.carga = Math.min(100,Math.max(1, carga));
	}
	
	public void gastar() {
		if(carga > 0)
			carga--;
	}
	
	public void recarregar() {
		if(carga < 100)
			carga++;
	}
	
	public boolean estaVazio() {
		return carga == 0;
	}
	
	public boolean estaCheio() {
		return carga == 100;
	}
	
	public void mostrarCarga() {
		System.out.println("Carga: " + carga);
	}
}
