package br.com.sga.facade;

import java.util.List;

import javax.ejb.Local;

import br.com.sga.model.Curso;

@Local
public interface CursoFacade {

	public abstract void saveUpdate(Curso curso);
	
	public abstract void delete(Curso curso);

	public abstract Curso find(int entityID);

	public abstract List<Curso> findAll();
	
}
