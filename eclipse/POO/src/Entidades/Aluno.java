package Entidades;
import java.time.LocalDate;
public class Aluno {
	LocalDate relogio = LocalDate.now();
	public static String getNome;
	private int matricula;
	private String nome;
	private int anoNascimento;
	private char genero;
	private boolean ativo;
	private int data;
	
	private Aluno() {
		
	}
	public Aluno(int matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;	
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	

	public int idade( int anoNascimento) {
		this.anoNascimento = anoNascimento;
		return (data - anoNascimento);
	}
	public String generoAluno(char genero) {
		this.genero = genero;
		String generoAluno;
		if (genero == 'M') {
			  generoAluno = "Aluno";
		} else if(genero == 'F') {
			  generoAluno ="Aluna";	
		} else {
			 generoAluno = "Alune";
		}
		return generoAluno;
	}
	public void situacao(char ativo) {
		if (ativo == 'S') {
			this.ativo = true;
		} else {
			this.ativo = false;
		}
		
	}
}
