package br.com.promoshare.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.promoshare.model.Promocao;
 
@ManagedBean(name = "promoService")
@ApplicationScoped
public class PromocaoService {
     
    private final static String[] nomes;
     
    private final static String[] descricoes;
     
    static {
        nomes = new String[10];
        nomes[0] = "Frango";
        nomes[1] = "Arroz";
        nomes[2] = "Feij�o";
        nomes[3] = "Carne";
        nomes[4] = "Peixe";
        nomes[5] = "Alface";
        nomes[6] = "Cebola";
        nomes[7] = "Cenoura";
        nomes[8] = "Pimenta";
        nomes[9] = "Refrigerante";
         
        descricoes = new String[10];
        descricoes[0] = "Muito bom";
        descricoes[1] = "Extremamente barato";
        descricoes[2] = "Acaba r�pido";
        descricoes[3] = "N�o pode perder";
        descricoes[4] = "N�o encontrei mais barato";
        descricoes[5] = "Melhor pre�o";
        descricoes[6] = "Bom, bonito e barato";
        descricoes[7] = "Est� acabando";
        descricoes[8] = "N�o vai durar";
        descricoes[9] = "Corre l�";
    }
     
    public List<Promocao> criarPromocoes(int size) {
        List<Promocao> list = new ArrayList<Promocao>();
        for(int i = 0 ; i < size ; i++) {
        	Promocao promo = new Promocao(getRandomNome(), getRandomPreco(), getRandomDescricao());
            System.out.println("Promocao nova: " + promo.toString());
        	list.add(promo);
        }
         
        return list;
    }
    
    private String getRandomDescricao() {
        return descricoes[(int) (Math.random() * 10)];
    }
     
    private String getRandomNome() {
        return nomes[(int) (Math.random() * 10)];
    }
     
    public double getRandomPreco() {
        return (double) (Math.random() * 10);
    }
     
    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }
 
    public List<String> getColors() {
        return Arrays.asList(nomes);
    }
     
}