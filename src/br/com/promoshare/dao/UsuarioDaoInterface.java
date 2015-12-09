package br.com.promoshare.dao;

import java.util.ArrayList;

import br.com.promoshare.model.Usuario;

public interface UsuarioDaoInterface {
	public void save(Usuario user);
	public void delete(Usuario user);
	public ArrayList<Usuario> listaUsuarios();

}
