package Repositorios;

import Entidades.*;

public class RepositorioCliente {
	//----------------- Atributos --------------------------
	
	private Cliente[] clientes;
	
	// --------------- Get & Set --------------------------
	
	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	// ----------------- Métodos -------------------------
	public void adicionar(Cliente cliente){
			for(int i = 0; i < clientes.length; i++)
				if(clientes[i] == null){
				clientes[i] = cliente;
				System.out.println("Cliente adicionado.");
			}
				else{
					System.out.println("Lista de clientes lotada.");
				}
	}
	
	public void remover(int id){
		clientes[id] = null;
		System.out.println("Cliente removido.");
	}
	
	public void alterarSenha(int id,String novaSenha){
		if(clientes.length == id){
			clientes[id].setSenha(novaSenha);
			System.out.println("Senha alterada.");
		}
	}
	public void alterarNome(int id,String novoNome){
		if(clientes.length == id){
			clientes[id].setNome(novoNome);
			System.out.println("Nome alterado.");
		}
	}
}
