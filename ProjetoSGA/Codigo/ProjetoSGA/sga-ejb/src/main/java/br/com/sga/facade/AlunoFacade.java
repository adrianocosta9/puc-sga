package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Aluno;

public interface AlunoFacade {

	public abstract void saveUpdate(Aluno aluno);
	
	public abstract void delete(Aluno aluno);

	public abstract Aluno find(int entityID);

	public abstract List<Aluno> findAll();
	
}
