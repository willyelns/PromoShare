package br.com.promoshare.model;

import java.util.Date;

public class Comentario {
	
	private Usuario criadorComentario;
	private String descricao;
	private Date dataCriacao;
	
	
	public Usuario getCriadorComentario() {
		return criadorComentario;
	}
	public void setCriadorComentario(Usuario criadorComentario) {
		this.criadorComentario = criadorComentario;
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

}
