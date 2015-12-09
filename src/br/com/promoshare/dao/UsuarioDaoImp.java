package br.com.promoshare.dao;

import java.util.ArrayList;

import br.com.promoshare.model.Usuario;

public class UsuarioDaoImp implements UsuarioDaoInterface{

	static private ArrayList<Usuario> database = new ArrayList<Usuario>();
	
	@Override
	public void save(Usuario user) {
		// TODO Auto-generated method stub
		if(database.size() == 0){
			user.setId(0);
		}else{
			user.setId(database.size() + 1);
		}
		database.add(user);
		
	}

	@Override
	public void delete(Usuario user) {
		// TODO Auto-generated method stub
		
		database.remove(user.getId());
	}

	@Override
	public ArrayList<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return database;
	}
	
	
}
