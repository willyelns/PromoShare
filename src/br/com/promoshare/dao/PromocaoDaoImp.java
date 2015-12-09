package br.com.promoshare.dao;

import java.util.ArrayList;

import br.com.promoshare.model.Promocao;

public class PromocaoDaoImp implements PromocaoDaoInterface{

	private static ArrayList<Promocao> database = new ArrayList<Promocao>();
	
	@Override
	public void save(Promocao promo) {
		// TODO Auto-generated method stub
		if(database.size() == 0){
			promo.setId(0);
		}else{
			promo.setId(database.size() + 1);
			database.add(promo);
		}
		
	}

	@Override
	public void delete(Promocao promo) {
		// TODO Auto-generated method stub
		database.remove(promo.getId());
	}

	@Override
	public ArrayList<Promocao> listaPromocao() {
		// TODO Auto-generated method stub
		return database;
	}

}
