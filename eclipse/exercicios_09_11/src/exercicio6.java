import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com os valores de: (x1)");
		int x1 = input.nextInt();
		System.out.println("Entre com os valores de: (x2)");
		int x2 = input.nextInt();
		System.out.println("Entre com os valores de: (y1)");
		int y1 = input.nextInt();
		System.out.println("Entre com os valores de: (y2)");
		int y2 = input.nextInt();
		int x3 = x2 - x1;
		int y3 = y2 - y1;
	
		int D =  (int) (Math.pow(x3,2) + Math.pow(y3,2));
		int resultado = (int) Math.sqrt(D);
		
		System.out.println("O resultado da equação é: "+resultado);

	}

}
