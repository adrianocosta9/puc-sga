package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Matricula;

@Stateless
public class MatriculaDAO extends GenericDAO<Matricula>{

	public MatriculaDAO() {
        super(Matricula.class);
    }
	
	public void salvarAtualizar(Matricula matricula) throws NoResultException {
		
		if (matricula.getId() != null) {
			super.update(matricula);
		} else {
			super.save(matricula);
		} 
		
	}
	
    public void delete(Matricula matricula) {
            super.delete(matricula.getId(), Matricula.class);
    }
		
}