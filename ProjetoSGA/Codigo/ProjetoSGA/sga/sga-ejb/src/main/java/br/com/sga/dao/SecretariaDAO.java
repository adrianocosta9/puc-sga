package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Secretaria;

@Stateless
public class SecretariaDAO extends GenericDAO<Secretaria>{

	public SecretariaDAO() {
        super(Secretaria.class);
    }
	
	public void salvarAtualizar(Secretaria secretaria) throws NoResultException {
		
		if (secretaria.getId() != null) {
			super.update(secretaria);
		} else {
			super.save(secretaria);
		} 
		
	}
	
    public void delete(Secretaria secretaria) {
            super.delete(secretaria.getId(), Secretaria.class);
    }
		
}