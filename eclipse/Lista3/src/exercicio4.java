import java.util.Scanner;
public class exercicio4 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int valor; 
		System.out.print("Insira um valor entre 0 e 100:");
		valor = input.nextInt();
		System.out.print(valor+" ");
		while(valor <= 100) {
			
			valor = valor * 3;
			System.out.print(valor+" ");
			
			}
		}	
	}