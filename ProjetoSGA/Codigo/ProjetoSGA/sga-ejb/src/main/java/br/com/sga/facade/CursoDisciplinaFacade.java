package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.CursoDisciplina;

public interface CursoDisciplinaFacade {

	public abstract void saveUpdate(CursoDisciplina cursoDisciplina);
	
	public abstract void delete(CursoDisciplina cursoDisciplina);

	public abstract CursoDisciplina find(int entityID);

	public abstract List<CursoDisciplina> findAll();
	
}
