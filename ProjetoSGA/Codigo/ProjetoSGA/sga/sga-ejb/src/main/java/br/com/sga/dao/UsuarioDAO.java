package br.com.sga.dao;

import javax.ejb.Stateless;

import br.com.sga.model.Usuario;

@Stateless
public class UsuarioDAO extends GenericDAO<Usuario>  {

	public UsuarioDAO() {
        super(Usuario.class);
    }

	public Usuario findUserByUserName(String name) {
		
		return null;
	}

	public void saveUpdate(Usuario usuario) {
		
		if (usuario.getUsername() != null) {
			super.update(usuario);
		} else {
			super.save(usuario);
		}
		
	}
	
	
}
