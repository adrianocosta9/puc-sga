package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.CursoDisciplina;

@Stateless
public class CursoDisciplinaDAO extends GenericDAO<CursoDisciplina>{

	public CursoDisciplinaDAO() {
        super(CursoDisciplina.class);
    }
	
	public void salvarAtualizar(CursoDisciplina cursoDisciplina) throws NoResultException {
		
		if (cursoDisciplina.getId() != null) {
			super.update(cursoDisciplina);
		} else {
			super.save(cursoDisciplina);
		} 
		
	}
	
    public void delete(CursoDisciplina cursoDisciplina) {
            super.delete(cursoDisciplina.getId(), CursoDisciplina.class);
    }
		
}