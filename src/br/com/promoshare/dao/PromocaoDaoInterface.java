package br.com.promoshare.dao;

import java.util.ArrayList;

import br.com.promoshare.model.Promocao;

public interface PromocaoDaoInterface {

	public void save(Promocao promo);
	public void delete(Promocao promo);
	public ArrayList<Promocao> listaPromocao();
}
