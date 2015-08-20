package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.AlunoDisciplina;

public interface AlunoDisciplinaFacade {

	public abstract void saveUpdate(AlunoDisciplina alunoDisciplina);
	
	public abstract void delete(AlunoDisciplina alunoDisciplina);

	public abstract AlunoDisciplina find(int entityID);

	public abstract List<AlunoDisciplina> findAll();
	
}
