package com.si.outro;

import com.si.heranca.A;
import com.si.heranca.B;

public class Teste {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A[] as = new A[4];
		//instanceof verifica se um objeto
		//eh instancia de uma classe.
		System.out.println(a instanceof A);
		System.out.println(b instanceof B);
		System.out.println(c instanceof C);
		//System.out.println(as instanceof A);
		System.out.println(c instanceof B);
		System.out.println(b instanceof A);
		System.out.println(b instanceof C);
		System.out.println(null instanceof Object);
	}

}
