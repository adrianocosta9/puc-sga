package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.Aluno;

@Stateless
public class AlunoDAO extends GenericDAO<Aluno>{

	public AlunoDAO() {
        super(Aluno.class);
    }
	
	public void salvarAtualizar(Aluno aluno) throws NoResultException {
		
		if (aluno.getId() != null) {
			super.update(aluno);
		} else {
			super.save(aluno);
		} 
		
	}
	
    public void delete(Aluno aluno) {
    }
		
}