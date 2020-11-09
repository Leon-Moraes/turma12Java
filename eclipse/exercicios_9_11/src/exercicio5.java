import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double indice;
		
		System.out.print("Entre com o indice de poluição:");
		indice = input.nextDouble();
		
		if(indice < 0.25 && indice > 0.5) {
			System.out.println("Erro! Ensira novamente um indice entre 0.0 e 0.5: ");
			indice = input.nextDouble();
		}
		if(indice >= 0.25 && indice < 0.3) {
			System.out.println("Indice dentro dos padrões de emissão aceitaveis.");
		}
		if(indice >= 0.3 && indice < 4.0) {
			System.out.println("Emitir intimação para a suspenção das atividades da industria 1");
		}
		if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Emitir intimação para a suspenção das atividades das industrias 1 e 2");
		}
		if(indice == 0.5) {
			System.out.println("Indice muito alto, emitir notificação de suspenção de atividades para todas as industrias");
		}
	}

}
