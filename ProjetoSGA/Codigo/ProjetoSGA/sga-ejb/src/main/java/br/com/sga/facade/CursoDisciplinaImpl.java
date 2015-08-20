package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.CursoDisciplinaDAO;
import br.com.sga.model.CursoDisciplina;

@Stateless
public class CursoDisciplinaImpl implements CursoDisciplinaFacade {

	@EJB
	private CursoDisciplinaDAO cursoDisciplinaDAO;
	
	@Override
	public void saveUpdate(CursoDisciplina cursoDisciplina) {
		cursoDisciplinaDAO.salvarAtualizar(cursoDisciplina);
		
	}

	@Override
	public void delete(CursoDisciplina cursoDisciplina) {
		cursoDisciplinaDAO.delete(cursoDisciplina);
		
	}

	@Override
	public CursoDisciplina find(int entityID) {
		return cursoDisciplinaDAO.find(entityID);
	}

	@Override
	public List<CursoDisciplina> findAll() {
		return cursoDisciplinaDAO.findAll();
	}

	
}
