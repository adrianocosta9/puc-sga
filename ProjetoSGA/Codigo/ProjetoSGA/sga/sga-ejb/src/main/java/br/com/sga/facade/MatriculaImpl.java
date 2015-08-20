package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.MatriculaDAO;
import br.com.sga.model.Matricula;

@Stateless
public class MatriculaImpl implements MatriculaFacade {

	@EJB
	private MatriculaDAO matriculaDAO;
	
	@Override
	public void saveUpdate(Matricula matricula) {
		matriculaDAO.salvarAtualizar(matricula);
		
	}

	@Override
	public void delete(Matricula matricula) {
		matriculaDAO.delete(matricula);
		
	}

	@Override
	public Matricula find(int entityID) {
		return matriculaDAO.find(entityID);
	}

	@Override
	public List<Matricula> findAll() {
		return matriculaDAO.findAll();
	}

	
}
