package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Matricula;

public interface MatriculaFacade {

	public abstract void saveUpdate(Matricula matricula);
	
	public abstract void delete(Matricula matricula);

	public abstract Matricula find(int entityID);

	public abstract List<Matricula> findAll();
	
}
