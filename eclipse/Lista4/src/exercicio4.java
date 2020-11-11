import java.util.Scanner;
public class exercicio4 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int userMatriz[][] = new int[3][3]; int x; int y; int vetor[] = new int[3];
		
		for( x = 0; x<3; x++) {
			for( y = 0; y<3; y++) {
				System.out.print("Entre com o valor da Matriz["+(x+1)+"]"+"["+(y+1)+"]"+":");
				userMatriz[x][y] = input.nextInt();
				
			}
		}
		System.out.print("Matriz: \n");
		for( x = 0; x<3; x++) {
			for( y = 0; y<3; y++) {	
				System.out.print(userMatriz[x][y]+"\t");
			}
		System.out.print("\n");	
		}
		
			vetor[0] = userMatriz[0][0];
			vetor[1] = userMatriz[1][1];
			vetor[2] = userMatriz[2][2];
			System.out.println("Diagonal principal da matriz:");
		for( x = 0; x<3; x++) {
			System.out.print(vetor[x]+"\n");
		}
	}
}
