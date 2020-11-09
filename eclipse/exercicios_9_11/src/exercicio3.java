 import java.util.Scanner;
public class exercicio3 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		int A; int B; int C; int D;
		
		System.out.println("Entre com 4 valores:");
		System.out.print("A:");
		A = input.nextInt();
		System.out.print("\nB:");
		B = input.nextInt();
		System.out.print("\nC:");
		C = input.nextInt();
		System.out.print("\nD:");
		D = input.nextInt();
		
		A = (int) Math.pow(A, 2);
		B = (int) Math.pow(B , 2);
		C = (int) Math.pow(C, 2);
		D = (int) Math.pow(D, 2);
		
		if(C >= 1000) {
			
			System.out.println("C = "+C);
		} else {
			System.out.println("\nA = "+A+"\nB = "+B+"\nC = "+C+"\nD = "+D);
		}
	}
}
