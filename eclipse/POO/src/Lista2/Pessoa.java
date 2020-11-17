package Lista2;

import java.time.LocalDateTime;

public class Pessoa {
	
	private int data = LocalDateTime.now().getYear(); 
	private String nome;
	private int anoNascimento;
	private int altura;
	private int cpf;
	private String nacionalidade;
	private char genero;
	

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	public Pessoa(int cpf, String nacionalidade, char genero) {
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.genero = genero;
	}
	
	public int idade(int data, int anoNascimento ) {
		this.data = data;
		this.anoNascimento = anoNascimento;
		int idade = data - anoNascimento;
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getData() {
		return data;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
}
