import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		System.out.println("Insira os valores de:");
		System.out.println("A:");
		A = input.nextInt();
		System.out.println("B:");
		B = input.nextInt();
		System.out.println("C:");
		C = input.nextInt();
		
		int R = ((A+B)*(A+B));
		int S = ((B+C)*(B+C));
		int D = ((R + S) /2);
		
		System.out.println("O resultado da D é: "+D);
	
	}

}
