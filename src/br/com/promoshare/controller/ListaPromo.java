package br.com.promoshare.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.promoshare.model.Promocao;
import br.com.promoshare.service.PromocaoService;
 
@ManagedBean(name="listaPromo")
@ViewScoped
public class ListaPromo implements Serializable {
     
	private static final long serialVersionUID = 1L;

	private List<Promocao> promos;
     
    @ManagedProperty("#{promoService}")
    private PromocaoService service;
 
    @PostConstruct
    public void init() {
        promos = service.criarPromocoes(10);
        System.out.println("Lista Promo rodou");
    }
     
    public List<Promocao> getPromos() {
        return promos;
    }
 
    public void setService(PromocaoService service) {
        this.service = service;
    }
    public String irLogado(){
    	return "usuarioLogado";
    
    }
}