import java.util.Scanner;

public class exercicio4 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int N;
		System.out.print("Entre com um numero: ");
		N = input.nextInt();
		
		if(N % 2 == 0 ) {
			System.out.print("O numero "+N+" é par ");
			if(N > 0) {
				System.out.print("e positivo.");
			}else {
				System.out.println("e negativo.");
			}
			
			
		} else if(N % 2 != 0 ) {
			System.out.println("O numero "+N+" é impar ");
			if(N > 0) {
				System.out.print("e positivo.");
			}else {
				System.out.print("e negativo.");
			}
		}
			
	}
}

