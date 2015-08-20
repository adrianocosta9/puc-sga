package br.com.sga.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.CoordenadorDAO;
import br.com.sga.model.Coordenador;

@Stateless
public class CoordenadorImpl implements CoordenadorFacade {

	@EJB
	private CoordenadorDAO coordenadorDAO;

	@Override
	public void saveUpdate(Coordenador coordenador) {
		coordenadorDAO.salvarAtualizar(coordenador);

	}

	@Override
	public void delete(Coordenador coordenador) {
		coordenadorDAO.delete(coordenador);

	}

	@Override
	public Coordenador find(int entityID) {
		return coordenadorDAO.find(entityID);
	}

	@Override
	public List<Coordenador> findAll() {
		return coordenadorDAO.findAll();
	}

}
