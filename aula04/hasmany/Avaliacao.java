package com.si.hasmany;

public class Avaliacao {
	//Avaliacao HAS-A Aluno
	private Aluno aluno;
	private double p1, p2;
	
	public Avaliacao(Aluno aluno, double p1, double p2) {
		this.aluno = aluno;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public boolean estaAprovado() {
		return 0.5*(p1+p2) >= 6;
	}
	
	public void mostrarDados() {
		System.out.println("Aluno: " + aluno.getAluno());
		System.out.println("P1 " + p1);
		System.out.println("P2 " + p2);
	}
	
	public double getP1() {
		return p1;
	}
	
	public double getP2() {
		return p2;
	}

}
