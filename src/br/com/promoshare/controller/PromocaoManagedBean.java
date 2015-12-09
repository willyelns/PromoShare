package br.com.promoshare.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.promoshare.dao.PromocaoDaoImp;
import br.com.promoshare.dao.PromocaoDaoInterface;
import br.com.promoshare.model.Promocao;

@ManagedBean
@RequestScoped
public class PromocaoManagedBean {
	
	private Promocao promo;
	private PromocaoDaoInterface dao;
	
	@PostConstruct
	public void init(){
		promo = new Promocao();
		dao = new PromocaoDaoImp();
		System.out.println("Abriu promoção");
		System.out.println("Dados promoção -> " + promo.toString());
	}

	public Promocao getPromo() {
		return promo;
	}

	public void setPromo(Promocao promo) {
		this.promo = promo;
	}
	
	public String irVerPromo(){
		System.out.println("");
		return "listaPromocao";
	}
	
	public String irCriarPromocao(){
		System.out.println("");
		return "criarPromocao";
	}
	public String criarPromocao(){
		
		System.out.println("Dao criando -> " + promo.toString());
		dao.save(promo);
		
		return "usuarioLogado";
	}
}
