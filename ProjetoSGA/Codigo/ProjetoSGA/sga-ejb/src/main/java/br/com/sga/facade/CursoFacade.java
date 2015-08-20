package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Curso;

public interface CursoFacade {

	public abstract void saveUpdate(Curso curso);
	
	public abstract void delete(Curso curso);

	public abstract Curso find(int entityID);

	public abstract List<Curso> findAll();
	
}
