package com.si.outro;

import com.si.heranca.B;

//metodo7 n eh acessivel, pois ele eh default
//e a classe C está em outro pacote.

//o metodo8 eh acessivel pelas referencias
//this e super. Porém, por qualquer
//outra referência não é acessível.
public class C extends B{
	
	public void metodo6() {
		System.out.println("Metodo 6");
		metodo8();
	}
	
	public void metodo10(B b) {
		b.metodo1();
		b.metodo2();
	}
}
