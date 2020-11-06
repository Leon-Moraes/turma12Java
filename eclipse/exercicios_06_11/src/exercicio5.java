import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1; double nota2; double nota3; int totalNotas = 3;
		double peso1 = 2; double peso2 = 3; double peso3 = 4;
		
		System.out.println("Entre com as notas do aluno: ");
		System.out.println("Nota1: ");
		nota1 = input.nextDouble();
		System.out.println("Nota2: ");
		nota2 = input.nextDouble();
		System.out.println("Nota3: ");
		nota3 = input.nextDouble();
		
		double notaPonderada1 = (nota1 * peso1);
		double notaPonderada2 = (nota2 * peso2);
		double notaPonderada3 = (nota3 * peso3);
		
		double media = (notaPonderada1 + notaPonderada2 + notaPonderada3) / totalNotas;
		
		System.out.println("A média do aluno é:"+media);
	}

}
