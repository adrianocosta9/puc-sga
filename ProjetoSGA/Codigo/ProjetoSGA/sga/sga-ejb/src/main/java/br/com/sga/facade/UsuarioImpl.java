package br.com.sga.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.sga.dao.UsuarioDAO;
import br.com.sga.model.Usuario;

@Stateless
public class UsuarioImpl implements UsuarioFacade {

	@EJB
	UsuarioDAO usuarioDAO;
	
	@Override
	public void saveUpdate(Usuario usuario) {
		usuarioDAO.saveUpdate(usuario);		
	}

	@Override
	public Usuario findUserByUserName(String name) {
		return usuarioDAO.findUserByUserName(name);
	}

}
