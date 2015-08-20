package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.AlunoDisciplinaDAO;
import br.com.sga.model.AlunoDisciplina;

@Stateless
public class AlunoDisciplinaImpl implements AlunoDisciplinaFacade {

	@EJB
	private AlunoDisciplinaDAO alunoDisciplinaDAO;
	
	@Override
	public void saveUpdate(AlunoDisciplina alunoDisciplina) {
		alunoDisciplinaDAO.salvarAtualizar(alunoDisciplina);
		
	}

	@Override
	public void delete(AlunoDisciplina alunoDisciplina) {
		alunoDisciplinaDAO.delete(alunoDisciplina);
		
	}

	@Override
	public AlunoDisciplina find(int entityID) {
		return alunoDisciplinaDAO.find(entityID);
	}

	@Override
	public List<AlunoDisciplina> findAll() {
		return alunoDisciplinaDAO.findAll();
	}

	
}
