package Entidades;

public class Restaurante extends Usuario{ //Restaurante herda atributos e métodos da classe usuário. Só não herda o construtor o qual deve-se implementar.
	
	// Atributos a mais da classe Restaurante.
	
	private Pedido[] pedidosEspera;
	private ItemCardapio[] cardapio;
	int MAX_PRATOS = 150;
	
	// --------------------- Construtor da classe Restaurante ----------------------------
	
		Restaurante(String login,String senha,String nome,long id,Pedido[] pedidosEspera,ItemCardapio[] cardapio){ // Parâmetros comuns e a mais da classe Restaurante
			super(login,senha,nome,id); // Comando Super apenas com os parâmetros comuns entre as 3 classes (Restaurante,Gerente,Cliente)
			
			this.pedidosEspera = pedidosEspera; 
			this.cardapio = cardapio;
		}
	
	// ------------------------------------- Get & Set ------------------------------
	public Pedido[] getPedidosEspera() {
		return pedidosEspera;
	}

	public void setPedidosEspera(Pedido[] pedidosEspera) {
		this.pedidosEspera = pedidosEspera;
	}

	public ItemCardapio[] getCardapio() {
		return cardapio;
	}

	public void setCardapio(ItemCardapio[] cardapio) {
		this.cardapio = cardapio;
	}
	
	// -------------------- Métodos da classe Restaurante --------------------------------
	
	void itemCardapio(){
		//
	}
	
	void listarPedidos(){
		if(pedidosEspera != null){
		for(int i = 0; i <= pedidosEspera.length; i++)  // ** IMPLEMENTAR PARA IMPRIMIR OS ID'S DOS PEDIDOS 
			System.out.println(i +". Pedidos em espera: "+ pedidosEspera[i]);
		}
		else{
			System.out.println("Nenhum pedido realizado.");
		}
	}
	
	void confirmarPedido(long clienteId){
		//
	}
	void cancelarPedido(long clienteId){
		//
	}
	
	void adicionarPrato(ItemCardapio item){
		for(int i = 0; i < cardapio.length; i++)
			if(i < MAX_PRATOS){
				System.out.println("Prato "+ item +" adicionado com sucesso");
			}
	}
	
	void removerPrato(int id){
		for(int i = 0; i < cardapio.length; i++)
			if(cardapio[i].equals(id)){
				cardapio[i] = null;
			}
				else
					System.out.println("Código do prato inexistente");
			}
	
	// ---------------------- Teste ----------------------------------------------
	
	public static void main(String[] args){
		
	Restaurante r1 = new Restaurante("Rest Kisu", "123", "Kisu", 40,null , null);
	
	System.out.println("Login: "+ r1.login);
	System.out.println("Senha: "+ r1.senha);
	System.out.println("Nome: "+ r1.nome);
	System.out.println("ID: "+ r1.id); 

	}
}
