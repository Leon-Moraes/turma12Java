import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double indice;
		
		System.out.print("Entre com o indice de polui��o:");
		indice = input.nextDouble();
		
		if(indice < 0.25 && indice > 0.5) {
			System.out.println("Erro! Ensira novamente um indice entre 0.0 e 0.5: ");
			indice = input.nextDouble();
		}
		if(indice >= 0.25 && indice < 0.3) {
			System.out.println("Indice dentro dos padr�es de emiss�o aceitaveis.");
		}
		if(indice >= 0.3 && indice < 4.0) {
			System.out.println("Emitir intima��o para a suspen��o das atividades da industria 1");
		}
		if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Emitir intima��o para a suspen��o das atividades das industrias 1 e 2");
		}
		if(indice == 0.5) {
			System.out.println("Indice muito alto, emitir notifica��o de suspen��o de atividades para todas as industrias");
		}
	}

}
