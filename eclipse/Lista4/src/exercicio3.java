import java.util.Scanner;
public class exercicio3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int n1[][] = new int[4][6]; int n2[][] = new int[4][6];
		int m1[][] = new int[4][6]; int m2[][] = new int[4][6];
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 6; y++) {
				
				System.out.print("Entre com o valor da Matriz N1["+(x+1)+"]"+"["+(y+1)+"]"+":");
				n1[x][y] = input.nextInt();				
			}
		}
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 6; y++) {
				System.out.print("Entre com o valor da Matriz N2["+(x+1)+"]"+"["+(y+1)+"]"+":");
				n2[x][y] = input.nextInt();
			}
		}
		System.out.print("Matriz M1:");
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 6; y++) {
				m1[x][y] = n2[x][y] + n1[x][y];
				System.out.print(+m1[x][y]+"\t");	
			}
			System.out.println("\n");
		}
		System.out.print("Matriz M2:\n");
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 6; y++) {
				m2[x][y] = n2[x][y] + n1[x][y];
				System.out.print(m2[x][y]+"\t");
			}
			System.out.println("\n");
		}
	}
}