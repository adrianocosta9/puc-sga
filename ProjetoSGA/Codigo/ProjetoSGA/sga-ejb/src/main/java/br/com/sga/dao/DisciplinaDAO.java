package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Disciplina;

@Stateless
public class DisciplinaDAO extends GenericDAO<Disciplina>{

	public DisciplinaDAO() {
        super(Disciplina.class);
    }
	
	public void salvarAtualizar(Disciplina disciplina) throws NoResultException {
		
		if (disciplina.getId() != null) {
			super.update(disciplina);
		} else {
			super.save(disciplina);
		} 
		
	}
	
    public void delete(Disciplina disciplina) {
            super.delete(disciplina.getId(), Disciplina.class);
    }
		
}