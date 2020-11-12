import java.util.Scanner;
public class exercicio5 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double vetor[] = new double[5];
		
		int codigo;
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Entre com os valor para o vetor["+(x+1)+"]:");
			vetor[x] = input.nextDouble();
		}
		System.out.println("Escolha o código de exibição do vetor:\n0 - fim:\n1 - VETOR:\n2 - VETOR INVERTIDO:");
		codigo = input.nextInt();
		if(codigo == 0) {
			return;
		}
		if(codigo == 1) {
			System.out.println("VETOR:");
			 for(int x = 0; x<5; x++) {
					System.out.println(vetor[x]);
			}
		} if(codigo == 2) {
			System.out.println("VETOR INVERTIDO:");
			for(int x = 4; x>=0; x--) {
				System.out.println(vetor[x]);
			}
		}
	}
}

