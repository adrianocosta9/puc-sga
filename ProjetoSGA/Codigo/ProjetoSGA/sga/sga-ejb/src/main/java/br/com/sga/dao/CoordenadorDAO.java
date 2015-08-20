package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Coordenador;

@Stateless
public class CoordenadorDAO extends GenericDAO<Coordenador>{

	public CoordenadorDAO() {
        super(Coordenador.class);
    }
	
	public void salvarAtualizar(Coordenador coordenador) throws NoResultException {
		
		if (coordenador.getId() != null) {
			super.update(coordenador);
		} else {
			super.save(coordenador);
		} 
		
	}
	
    public void delete(Coordenador coordenador) {
            super.delete(coordenador.getId(), Coordenador.class);
    }
		
}