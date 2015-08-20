package br.com.sga;

import java.util.ArrayList;
import java.util.List;

public class MockAlunoNota {
	
	static List<AlunoNota> list = new ArrayList<AlunoNota>();
	static AlunoNota aluno  = new AlunoNota("1", "aluno" , "10", "01/2015", "Calculo", "Ciencia da computacao");
	static AlunoNota aluno1 = new AlunoNota("2", "aluno1", "10", "01/2015", "Trigonometria", "Matematica");
		
	static List<AlunoNota> findAll() {	
		
		list.add(aluno1);
		list.add(aluno);
		
		return list;
		
	}
	
	static AlunoNota findNotaByMatricula(String matricula){
		
		list.add(aluno1);
		list.add(aluno);
		 
		for (AlunoNota aluno : list) {
			if (aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		
		return null;
		
	}
	
	static AlunoNota findNotaByAluno(String alunoParam){
		
		list.add(aluno1);
		list.add(aluno);
		 
		for (AlunoNota aluno : list) {
			if (aluno.getNomeAluno().equals(alunoParam)) {
				return aluno;
			}
		}
		
		return null;
		
	}
	
}
