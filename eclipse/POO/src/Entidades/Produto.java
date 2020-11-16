package Entidades;

public class Produto {
	
    public String nome;
    public double medida;
    public int quantidade ;
    public String valorProdutoUni;
    
    public Produto(){
    }
    public Produto(String nome, double medida, int quantidade, String valorProdutoUni) {
		this.nome = nome;
		this.medida = medida;
		this.quantidade = quantidade;
		this.valorProdutoUni = valorProdutoUni;
    }
}		