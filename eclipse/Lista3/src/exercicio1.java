import java.util.Scanner;

public class exercicio1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double maiorSalario = 0.0;double totalSalario = 0.0;int totalFilhos = 0;double pessoasPercentual = 0;
		int habitantes = 20; int numeroFilhos[] = new int[habitantes]; double salario[] = new double[habitantes];
		for(int x = 0; x < habitantes; x++) {
			System.out.print("\nEntre com o Salario do cidad�o "+(x+1)+":");
			salario[x] = input.nextDouble();
			totalSalario = (totalSalario + salario[x]);
			if(maiorSalario < salario[x]) {
				maiorSalario = salario[x];
				
			}
			if(salario[x] <= 100) {
				pessoasPercentual = pessoasPercentual + 1; 
			}
		}
		for(int x = 0; x < habitantes; x++) {
			System.out.print("\nEntre com o numero de filhos do cidad�o "+(x+1)+":");
			numeroFilhos[x] = input.nextInt();
			totalFilhos = totalFilhos + numeroFilhos[x];
		}
		double percentual = ((pessoasPercentual) * (habitantes /100));
		int mediaFilhos = (totalFilhos / habitantes);
		double mediaSalarial = (totalSalario / habitantes);
		
		System.out.println("A m�dia salarial dos cidad�es �: R$"+mediaSalarial);
		System.out.println("A m�dia de filhos por cidad�o � de "+mediaFilhos);
		System.out.println("O percentual de cidad�es com salario at� R$ 100 � de: "+percentual+"%");
	}						
}

