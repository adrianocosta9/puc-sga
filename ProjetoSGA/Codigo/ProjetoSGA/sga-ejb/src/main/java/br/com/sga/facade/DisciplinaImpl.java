package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.DisciplinaDAO;
import br.com.sga.model.Disciplina;

@Stateless
public class DisciplinaImpl implements DisciplinaFacade {

	@EJB
	private DisciplinaDAO disciplinaDAO;
	
	@Override
	public void saveUpdate(Disciplina disciplina) {
		disciplinaDAO.salvarAtualizar(disciplina);
		
	}

	@Override
	public void delete(Disciplina disciplina) {
		disciplinaDAO.delete(disciplina);
		
	}

	@Override
	public Disciplina find(int entityID) {
		return disciplinaDAO.find(entityID);
	}

	@Override
	public List<Disciplina> findAll() {
		return disciplinaDAO.findAll();
	}

	
}
