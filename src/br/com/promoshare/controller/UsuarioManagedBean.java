package br.com.promoshare.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.promoshare.dao.UsuarioDaoImp;
import br.com.promoshare.dao.UsuarioDaoInterface;
import br.com.promoshare.model.Usuario;

@RequestScoped
@ManagedBean
public class UsuarioManagedBean {
	
	private Usuario user = new Usuario();
	private UsuarioDaoInterface dao;

	@PostConstruct
	public void init(){
		//user = new Usuario();
		dao = new UsuarioDaoImp();
		System.out.println(" Usuario Bean chamado ");
		//user.setNome("Will");
		//user.setSenha("123");
	}
	
	public void setUsuario(Usuario user){
		this.user = user;
	}
	public Usuario getUsuario(){
		return this.user;
	}
	
	public String logar(){
	 	String retorno = "";
		
		try{
			if(user.getNome().isEmpty() || user.getSenha().isEmpty()){
				
				FacesContext.getCurrentInstance().addMessage(
		                null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Dados inválidos", ""));
			}else{
				System.out.println("Usuario logado: " + user.getNome()+ " " + user.getSenha());
				retorno = "usuarioLogado";
				FacesContext.getCurrentInstance().addMessage(
		                null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario Logado!", ""));
				
			}
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(
	                null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Falha ao logar", ""));
			
		}
		
		return retorno;
	}
	public String getMessage(){
		return "PromoShare";
	}
	public String criarUsuario(){
		System.out.println("Cadastro -> " + "\n" + user.toString());
		
		//UsuarioDaoInterface dao = new UsuarioDaoImp();
		System.out.println("Depois -> " + " \n " + user.toString());
		dao.save(user);
		
		//ArrayList<Usuario> usuarios = dao.listaUsuarios();
		//for(Usuario user : usuarios){
		//	System.out.println(user.toString());
		//}
		
		FacesContext.getCurrentInstance().addMessage(
                null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario Criado com sucesso!", ""));
		
		
		return "index";
	}
	public String irPromo(){
		//UsuarioDaoInterface dao = new UsuarioDaoImp();
		ArrayList<Usuario> usuarios = dao.listaUsuarios();
		System.out.println("Lista:");
		for(Usuario user : usuarios){
			System.out.println("Usuario: " + user.toString());
		}
		
		return "index";
	}
	public String irCadastro(){
		user = new Usuario();
		System.out.println("Criando User -> " + user.toString());
		return "CadastroUsuario";
	}
	
	public String irLancamento(){
		System.out.println("Ir lançamento");
		
		return "";
	}
}
