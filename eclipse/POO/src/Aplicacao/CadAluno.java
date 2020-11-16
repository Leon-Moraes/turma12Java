package Aplicacao;
import java.util.Scanner;

import Entidades.Disciplina;
import Entidades.Pessoa;
public class CadAluno {

	public static void main(String[] args) {
		int escolha = 0;
		Scanner input = new Scanner(System.in);
		
		Pessoa aluno = new Pessoa();
		Disciplina curso = new Disciplina();
		
		System.out.println("SISTEMA DE CADASTRO DE ALUNOS POR MATERIA");
		System.out.println("Digite o nome do aluno");
		aluno.nome = input.nextLine();
		System.out.println("Digite M-Masculino, F-feminino ou O-outros: ");
		aluno.genero = input.next().toUpperCase().charAt(0);
		System.out.println("Escolha 1-JAVA ou 2-SQL : ");
		escolha = input.nextInt();
		
		if(escolha == 1) {
			curso.nome= "JAVA";
		} else if(escolha == 2) {
			curso.nome = "SQL";
		}
		if(aluno.genero == 'F') {
			System.out.printf("Oi %s, você é agora aluna do curso de %s",aluno.nome ,curso.nome);
		} else if(aluno.genero == 'M') {
			System.out.printf("Oi %s, você é agora aluno do curso de %s",aluno.nome ,curso.nome);
		} else {
			System.out.println("Você não inseriu seu gênero.");
		}
	}

}
