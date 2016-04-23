package Entidades;

public class Cliente extends Usuario{ //Cliente herda atributos e métodos da classe usuário. Só não herda o construtor o qual deve-se implementar.
	
	// Atributos a mais da classe Cliente.
	
	private long[] favoritos;
	private ItemCardapio[] carrinho;
	private final int MAX_ITENS_CARRINHO = 150;
	

	// --------------------- Construtor da classe Cliente ----------------------------
	
	public Cliente(String login, String senha, String nome, long id,long[] favoritos,ItemCardapio[] carrinho){
		super(login,senha,nome,id);
		
		this.favoritos = favoritos = new long[20];
		this.carrinho = carrinho = new ItemCardapio[150];
		}
	
	// ------------------------------------- Get & Set ------------------------------
	
	public void setFavoritos(long[] favoritos){
		this.favoritos = favoritos;
	}
	
	public long[] getFavoritos(){
		return favoritos;
	}
	
	public void setCarrinho(ItemCardapio[] carrinho){
		this.carrinho = carrinho;
	}
	
	public ItemCardapio[] getCarrinho(){
		return carrinho;
	}	
	

	// -------------------- Métodos da classe Cliente --------------------------------
	
	void mostrarFavoritos(){
		//
	}
	
	public void efetuarPedido(){
		// 
	}
	public void cancelarPedido(long longId, long clienteId){
		// 
	}
	
	public void adicionarNoCarrinho(ItemCardapio item){
		
		for(int i = 0; i < MAX_ITENS_CARRINHO ;i++)
			if(carrinho[i] == null){
				carrinho[i] = item;
				System.out.println(item.nome + " adicionado no carrinho.");
			}
				else{
					System.out.println("Carrinho cheio");
				}
			}
	
	public void removerCarrinho(long id){
		
		for(int i = 0; i < MAX_ITENS_CARRINHO; i++)
			if (!(carrinho[i] == null)){
				if(carrinho[i].id == id){
					carrinho[i] = null;
					System.out.println("Removido do carrinho");
					break;
				}
			}
	}
	
	// -------------------- Teste ------------------------------------------	
	
	public static void main(String[] args){
		
				long idItem1, idItem2;
				ItemCardapio item1 = new ItemCardapio("Frango", 5, 15);
				ItemCardapio item2 = new ItemCardapio("Arroz", 3, 20);
				
				Cliente cliente  = new Cliente("Cliente1", "123", "Victor Moura",0,null,null);
				
					idItem1 = item1.getId();
					idItem2 = item2.getId();
					cliente.adicionarNoCarrinho(item1);
					System.out.println(cliente.carrinho[0].nome); 
					cliente.removerCarrinho(idItem1);
					cliente.adicionarNoCarrinho(item2);
					System.out.println(cliente.carrinho[0].nome);
					System.out.println(cliente.carrinho[1].nome);
					cliente.removerCarrinho(idItem1);
					cliente.removerCarrinho(idItem2);				
				
					System.out.println("Login: "+ cliente.login);
					System.out.println("Senha: "+ cliente.senha);
					System.out.println("Nome: "+ cliente.nome);
					System.out.println("ID: "+ cliente.id);
					
					cliente.mostrarFavoritos();
					cliente.efetuarPedido();
					//cliente.cancelarPedido();
	
	}
}
	
