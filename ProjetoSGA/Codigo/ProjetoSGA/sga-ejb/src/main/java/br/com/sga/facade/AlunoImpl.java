package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.AlunoDAO;
import br.com.sga.model.Aluno;

@Stateless
public class AlunoImpl implements AlunoFacade {

	@EJB
	private AlunoDAO alunoDAO;
	
	@Override
	public void saveUpdate(Aluno aluno) {
		alunoDAO.salvarAtualizar(aluno);
		
	}

	@Override
	public void delete(Aluno aluno) {
		alunoDAO.delete(aluno);
		
	}

	@Override
	public Aluno find(int entityID) {
		return alunoDAO.find(entityID);
	}

	@Override
	public List<Aluno> findAll() {
		return alunoDAO.findAll();
	}

	
}
