package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Curso;

@Stateless
public class CursoDAO extends GenericDAO<Curso>{

	public CursoDAO() {
        super(Curso.class);
    }
	
	public void salvarAtualizar(Curso curso) throws NoResultException {
		
		if (curso.getId() != null) {
			super.update(curso);
		} else {
			super.save(curso);
		} 
		
	}
	
    public void delete(Curso curso) {
            super.delete(curso.getId(), Curso.class);
    }
		
}