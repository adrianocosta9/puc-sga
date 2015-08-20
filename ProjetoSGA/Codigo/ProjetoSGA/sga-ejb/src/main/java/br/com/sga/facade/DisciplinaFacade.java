package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Disciplina;

public interface DisciplinaFacade {

	public abstract void saveUpdate(Disciplina disciplina);
	
	public abstract void delete(Disciplina disciplina);

	public abstract Disciplina find(int entityID);

	public abstract List<Disciplina> findAll();
	
}
