package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Coordenador;

public interface CoordenadorFacade {

	public abstract void saveUpdate(Coordenador coordenador);
	
	public abstract void delete(Coordenador coordenador);

	public abstract Coordenador find(int entityID);

	public abstract List<Coordenador> findAll();
	
}
