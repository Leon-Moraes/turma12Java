package Entidades;

public class Conta {
	private String cpf;
	private double saldo;
	private int numero;
	
	public int debito( int saldo, int retirada) {
		saldo = saldo - retirada;
		return saldo;
	}
	public int credito (int saldo, int deposito) {
		saldo = saldo + deposito;
		return saldo;
	}
}