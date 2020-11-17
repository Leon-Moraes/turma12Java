package Aplicacao;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;
import Entidades.Aluno;
public class CadAlunos1 {

	public static void main(String[] args) {
		
		LocalDate relogio = LocalDate.now();
		Scanner input = new Scanner(System.in);
		
		int matricula; String nome; int ano = relogio.getYear();
		System.out.println("Entre com o nome e a matricula do aluno:");
		System.out.print("NOME: "); nome = input.nextLine();
		System.out.println("MATRICULA: "); matricula = input.nextInt();
		Aluno aluno1 = new Aluno(matricula, nome);
		
		
		aluno1.setNome(nome);
		aluno1.setMatricula(matricula);
		System.out.println("Defina o genero do aluno: ");
		aluno1.setGenero(input.next().toUpperCase().charAt(0));
		aluno1.generoAluno(aluno1.getGenero());
		
		System.out.println("Entre com o ano de nascimento do aluno: ");
		aluno1.setAnoNascimento(input.nextInt());
		aluno1.idade(aluno1.getAnoNascimento());
		
	}
}
