package Entidades;

public class Cliente {
	public String nome;
	public int idade;
	public String email;
	public int senha;
	
	public  Cliente(String nome, int idade, String email, int senha) {
		
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
	}
		public static void main(String[]args) {	
			
			Cliente cliente1 = new Cliente("Leonardo de Moraes", 25,"leo_o_nardo1@outlook.com", 123);
			
			
			System.out.println("Nome do cliente: "+cliente1.nome+"\tIdade: "+cliente1.idade+"\nEmail: "+cliente1.email);
	} 
}

