import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N;
		System.out.println("Entre com um valor: ");
		N = input.nextInt();
		
		if(N > 100) {
			System.out.println("O valor inserido foi de "+N);
		} else {
			N = N - N;
			System.out.println("O valor inserido foi inferior ou igual a 100, portanto é "+N+" .");
		}
	}

}
