package com.si.hasmany;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Teste1");
		Aluno a2 = new Aluno("Teste2");
		Aluno a3 = new Aluno("Teste3");
		Aluno a4 = new Aluno("Teste4");
		Avaliacao av1 = new Avaliacao(a1,10,10);
		Avaliacao av2 = new Avaliacao(a2,3,2);
		Avaliacao av3 = new Avaliacao(a3,7,5);
		Avaliacao av4 = new Avaliacao(a4,10,0);
		Disciplina d = new Disciplina("DSI");
		d.cadastrar(av1);
		d.cadastrar(av2);
		d.cadastrar(av3);
		d.cadastrar(av4);
		d.listarAprovados();
		d.mostrarMediaP1();
	}

}
