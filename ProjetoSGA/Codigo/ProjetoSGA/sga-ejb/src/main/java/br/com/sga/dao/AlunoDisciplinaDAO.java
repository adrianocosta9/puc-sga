package br.com.sga.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import br.com.sga.model.AlunoDisciplina;

@Stateless
public class AlunoDisciplinaDAO extends GenericDAO<AlunoDisciplina>{

	public AlunoDisciplinaDAO() {
        super(AlunoDisciplina.class);
    }
	
	public void salvarAtualizar(AlunoDisciplina alunoDisciplina) throws NoResultException {
		
		if (alunoDisciplina.getId() != null) {
			super.update(alunoDisciplina);
		} else {
			super.save(alunoDisciplina);
		} 
		
	}
	
    public void delete(AlunoDisciplina alunoDisciplina) {
            super.delete(alunoDisciplina.getId(), AlunoDisciplina.class);
    }
		
}