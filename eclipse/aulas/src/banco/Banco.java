package banco;
import java.time.LocalDateTime;
public class Banco {
	
	//ATRIBUTOS ---------------------------------------------------------
	
	private LocalDateTime dataTransacao = LocalDateTime.now(); 
	private int tipoConta;
	private String cpf;
	private String cnpj;
	private double saldo;
	private int numeroConta;
	
	//FIM DOS ATRIBUTOS -------------------------------------------------
	
								//
	
	//CONSTRUCTORS ------------------------------------------------------
	public void Conta() {
		
	}
	public void Conta(int numeroConta, int tipoConta) {
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;	
	}
	public void tipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
			
	}
	public void debito( int saldo, int debito) {
		this.saldo = saldo - debito;
		
	}
	public void credito (int saldo, int credito) {

		this.saldo = saldo + credito;
	}
	
	//FIM CONSTRUCTORS -------------------------------------------------
	
								//
	
	//GETTERS e SETTERS ------------------------------------------------
	public LocalDateTime getRelogio() { //RETORNA DATA E HORA, PARA SER UTILIZADO NA FATURA.
		return dataTransacao;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//FIM DOS GETTERS E SETTERS -----------------------------------------
}