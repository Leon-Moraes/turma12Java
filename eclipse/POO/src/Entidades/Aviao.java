package Entidades;

public class Aviao {
	public String modelo;
	public int capacidadePassageiros;
	public double capacidadeBagagem;
	public int combustivel;
	
	public Aviao(String modelo,int capacidadePassageiros, double capacidadeBagagem, int combustivel) {
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.capacidadeBagagem = capacidadeBagagem;
		this.combustivel = combustivel;
	}
	
	public static void main(String[]args) {
		Aviao boeing = new Aviao("Boeing-777",250, 2.0, 3000); 
		System.out.println("O avião de modelo: ("+boeing.modelo+") possui capacidade para "+boeing.capacidadePassageiros+" passageiros, "+boeing.capacidadeBagagem+" Toneladas de bagagem e "+boeing.combustivel+" litros de combustivel.");	
		
	}
}
