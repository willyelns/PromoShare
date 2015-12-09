package br.com.promoshare.model;

import java.util.ArrayList;
import java.util.Date;

public class Promocao {

	private long id;
	private String NomeProduto;
	private String descricao;
	private Date dataCriacao;
	private double precoProduto;
	private byte imagem;
	private Usuario criadorPost;
	private ArrayList<Comentario> comentarios; 
	
	public Promocao(){
	}
	
	public Promocao(String nome, double preco, String descricao){
		this.NomeProduto = nome;
		this.precoProduto = preco;
		this.descricao = descricao;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public byte getImagem() {
		return imagem;
	}
	public void setImagem(byte imagem) {
		this.imagem = imagem;
	}
	public Usuario getCriadorPost() {
		return criadorPost;
	}
	public void setCriadorPost(Usuario criadorPost) {
		this.criadorPost = criadorPost;
	}
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public double getPreçoProduto() {
		return precoProduto;
	}
	public void setPreçoProduto(double preçoProduto) {
		this.precoProduto = preçoProduto;
	}
	@Override
	public String toString() {
		return "Nome " + this.NomeProduto + " Preço " + this.precoProduto + " Descrição " + this.descricao + "Usuário: ";
	}
	
}
