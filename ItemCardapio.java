package Entidades;

public class ItemCardapio{
	//-------------------- Atributos ----------------------
	
	String nome;
	double preco;
	long id;
	
	// -------------------- Construtor --------------------
	
	ItemCardapio(String nome,double preco,long id){
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}
	
	// ------------------- Get & Set ----------------------
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return id;
	}	
	
	//------------------- Teste ---------------------------
	
	public static void main(String[]args){
		ItemCardapio Item = new ItemCardapio("Batata doce",5,1);
		
		System.out.println("Item disponível: "+ Item.nome);
		System.out.println("R$"+ Item.preco);	
		System.out.println("Código do item: "+ Item.id);
	}
}

