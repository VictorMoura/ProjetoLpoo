package Entidades;

public class Pedido{ 
	//------------------ Atributos -------------------------
	
	ItemCardapio[] itens;
	long idRestaurante;
	Status status;
	long idCliente;
	long idPedido;
	

	// ------------------ Construtor ------------------------------
	
	Pedido(ItemCardapio[] itens, long idRestaurante){
		this.itens = itens;
		this.idRestaurante = idRestaurante;
		this.status = Status.DEFAULT;
	}
		
	private static void verificarStatus(Status statusPedido){
		if (statusPedido == Status.ENVIADO){
			System.out.println("Enviado");
		}
		else{ 
			System.out.println("Pedido pendente");
		}
	}
	
	// ------------------- Get & Set -----------------------
	
	public ItemCardapio[] getItens() {
		return itens;
	}

	public void setItens(ItemCardapio[] itens) {
		this.itens = itens;
	}

	public long getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	// ------------------------------ Teste -----------------------------
	
	public static void main(String[]args){
		Pedido novoPedido = new Pedido(null,0); 
		
		novoPedido.idRestaurante = 10;
		verificarStatus(Status.ENVIADO);
		System.out.println(" ");
		System.out.println("ID restaurante: "+novoPedido.idRestaurante);
	}
}