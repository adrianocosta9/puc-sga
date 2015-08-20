package br.com.sga.facade;

import java.util.List;

import javax.ejb.Local;

import br.com.sga.model.Aluno;

@Local
public interface AlunoFacade {

	public abstract void saveUpdate(Aluno aluno);
	
	public abstract void delete(Aluno aluno);

	public abstract Aluno find(int entityID);

	public abstract List<Aluno> findAll();
	
}
