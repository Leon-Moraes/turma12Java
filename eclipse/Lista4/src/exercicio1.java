import java.util.Scanner;
public class exercicio1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor[] = new double[5]; double maiorPontuacao = 0;
		
		for(int x = 0; x < 5; x++) {
			System.out.print("Entre com o "+(x+1)+"º valor: ");
			valor[x] = input.nextDouble();
			
			if(valor[x] > maiorPontuacao) {
				maiorPontuacao = maiorPontuacao + valor[x];	
			}
		}
		System.out.println("A maior pontuação entre os 5 numeros inseridos foi de: "+maiorPontuacao);
	}
}