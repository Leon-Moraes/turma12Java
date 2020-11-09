import java.util.Scanner;

public class exercicio1 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	int P;
	double M = 4.00;
	int E;
	
	System.out.println("Entre com o peso dos tomates em KG: ");
	P = input.nextInt();
		if(P > 50) {
			E = (P - 50);
			M = (E * M);
			
		} else {
			E = 0;
			M = 0;
		}
	System.out.println("O peso dos tomates, excedeu "+E+"KG e gerou uma multa de R$"+M);
	}
}
