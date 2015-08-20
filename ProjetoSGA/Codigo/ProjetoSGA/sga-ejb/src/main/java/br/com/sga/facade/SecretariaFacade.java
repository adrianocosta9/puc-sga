package br.com.sga.facade;

import java.util.List;

import br.com.sga.model.Secretaria;

public interface SecretariaFacade {

	public abstract void saveUpdate(Secretaria secretaria);
	
	public abstract void delete(Secretaria secretaria);

	public abstract Secretaria find(int entityID);

	public abstract List<Secretaria> findAll();
	
}
