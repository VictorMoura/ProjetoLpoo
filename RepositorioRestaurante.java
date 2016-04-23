package Repositorios;

import Entidades.*;

public class RepositorioRestaurante {

	// ---------------- Atributo --------------------------
	
	private Restaurante[] restaurantes;
	
	// ----------------- Get & Set --------------------
	
	public Restaurante[] getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(Restaurante[] restaurantes) {
		this.restaurantes = restaurantes;
	}

	// ---------------- Métodos ----------------------------
	
	public void adicionar(Restaurante restaurante){
		for(int i = 0; i < restaurantes.length; i++)
			if(restaurantes[i] == null){
			restaurantes[i] = restaurante;
			System.out.println("Restaurante adicionado.");
		}
			else{
				System.out.println("Lista de restaurantes lotada.");
			}
	}
	
	public void remover(int id){
		restaurantes[id] = null;
		System.out.println("Restaurante removido.");
	}
	
	public void alterarSenha(int id, String novaSenha){
		if(restaurantes.length == id){
			restaurantes[id].setSenha(novaSenha);
			System.out.println("Senha alterada.");
		}
	}
	
	public void alterarNome(int id, String novoNome){
		if(restaurantes.length == id){
			restaurantes[id].setNome(novoNome);
			System.out.println("Nome alterado.");
		}
	}
}
