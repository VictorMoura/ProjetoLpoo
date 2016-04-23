package Entidades;

public class Usuario {
	// ----------------- Atributos -----------------------
	String login;
	String senha;
	String nome;
	long id;
	
	// ---------------- Construtor ------------------------
	
	Usuario(String login, String senha, String nome, long id){
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.id = id;
	}
	
	// ---------------- Get & Set -------------------------
	
	public void setLogin (String login){
		this.login = login;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public double getId(){
		return id;
	}	

}
