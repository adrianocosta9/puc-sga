package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.CursoDAO;
import br.com.sga.model.Curso;

@Stateless
public class CursoImpl implements CursoFacade {

	@EJB
	private CursoDAO cursoDAO;
	
	@Override
	public void saveUpdate(Curso curso) {
		cursoDAO.salvarAtualizar(curso);
		
	}

	@Override
	public void delete(Curso curso) {
		cursoDAO.delete(curso);
		
	}

	@Override
	public Curso find(int entityID) {
		return cursoDAO.find(entityID);
	}

	@Override
	public List<Curso> findAll() {
		return cursoDAO.findAll();
	}

	
}
