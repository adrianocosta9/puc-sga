package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.SecretariaDAO;
import br.com.sga.model.Secretaria;

@Stateless
public class SecretariaImpl implements SecretariaFacade {

	@EJB
	private SecretariaDAO matriculaDAO;
	
	@Override
	public void saveUpdate(Secretaria secretaria) {
		matriculaDAO.salvarAtualizar(secretaria);
		
	}

	@Override
	public void delete(Secretaria secretaria) {
		matriculaDAO.delete(secretaria);
		
	}

	@Override
	public Secretaria find(int entityID) {
		return matriculaDAO.find(entityID);
	}

	@Override
	public List<Secretaria> findAll() {
		return matriculaDAO.findAll();
	}

	
}
