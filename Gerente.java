package Entidades;

public class Gerente extends Usuario{ // Gerente herda atributos e métodos da classe usuário. Só não herda o construtor o qual deve-se implementar.
	
	// Atributos a mais da classe Gerente.
	
	private Restaurante[] restaurantes;
	private Cliente[] clientes;
	
	// --------------------- Construtor da classe Gerente ----------------------------
	
		Gerente(String login,String senha,String nome,long id,Restaurante[] restaurantes,Cliente[] clientes){
			super(login,senha,nome,id);
			
			this.restaurantes = restaurantes;
			this.clientes = clientes;
		}	
	
	// ------------------------------------- Get & Set ------------------------------
	
	public Restaurante[] getRestaurantes(){
		return restaurantes;
	}
	
	public void setRestaurantes(Restaurante[] restaurantes){
		this.restaurantes = restaurantes;
	}
	
	public Cliente[] getClientes(){
		return clientes;
	}
	
	public void setClientes(Cliente[] clientes){
		this.clientes = clientes;
	}	
	
	
	// -------------------- Métodos da classe Gerente --------------------------------
	
	void adicionarRestaurante(String login, String senha, String nome){
		//
	}
	void removerRestaurante(long restauranteId){
		//
	}
	void listarRestaurantes(){
		//
	}
	void adicionarCliente(String login, String senha, String nome){
		//
	}
	void removerCliente(long clienteId){
		//
	}
	void listarClientes(){
		//
	}
	void adicionarPrato(long restauranteId, long pratoId){
		//
	}
	void removerPrato(long restauranteId, long pratoId){
		//
	}

	// ------------------------ Teste -------------------------------------------
	
	public static void main(String[] args){
		Gerente gerente = new Gerente("VictorGerencia", "gerente123", "Victor", 100, null, null);
		
		System.out.println("Login: "+ gerente.login);
		System.out.println("Senha: "+ gerente.senha);
		System.out.println("Nome: "+ gerente.nome);
		System.out.println("ID: "+ gerente.id);
			
	}
	
	
}

