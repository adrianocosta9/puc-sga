package br.com.sga.facade;

import javax.ejb.Local;

import br.com.sga.model.Usuario;

@Local
public interface UsuarioFacade {
	
	public abstract Usuario findUserByUserName(String name);
	
	public abstract void saveUpdate(Usuario usuario);

}
