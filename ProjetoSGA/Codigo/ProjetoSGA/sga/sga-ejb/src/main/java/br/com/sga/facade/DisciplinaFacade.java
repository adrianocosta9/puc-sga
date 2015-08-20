package br.com.sga.facade;

import java.util.List;

import javax.ejb.Local;

import br.com.sga.model.Disciplina;

@Local
public interface DisciplinaFacade {

	public abstract void saveUpdate(Disciplina disciplina);
	
	public abstract void delete(Disciplina disciplina);

	public abstract Disciplina find(int entityID);

	public abstract List<Disciplina> findAll();
	
}
