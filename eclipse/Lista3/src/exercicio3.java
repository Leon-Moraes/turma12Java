import java.util.Scanner;
public class exercicio3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		boolean la�o = true; int x = 1; int soma = 0; int media = 0;
		while(la�o == true) {
			System.out.print("Ensira um numero:");
			int numero = input.nextInt();
			x++;
			soma = soma + numero;
			media = soma / x;
			if(numero < 0 ) {
				System.out.println("O total de valores positivos inseridos foi de: "+x+" e a soma dos valores � de: "+soma+" e o valor da m�dia dos valores � de: "+media);
				la�o = false;
			}
		}
	}
}
