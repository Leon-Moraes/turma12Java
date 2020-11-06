import java.util.Scanner;

public class meuNome {

	public static void main(String[] args) {
		
		//Instanciando um teclado
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento = 1995;
		int idade = 0;
		String nome;
		double salario = 2000.0;	
		
		idade = 2020 - anoNascimento;
		System.out.println("Digite o nome");
		nome = leia.next();
		System.out.printf("Meu nome é %s e minha idade é %d ",nome, idade);
	}
}
