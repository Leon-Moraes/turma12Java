import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C; int N; double E; double eS;
		System.out.println("Entre com o código do funcionario");
		C = input.nextInt();
		System.out.println("Entre com o numero de horas trabalhadas do funcionario: ");
		N = input.nextInt();
		double S = (N * 10.00);
		if(N>50) {
			E = N - 50;
			eS = (E * 20.00);
		} else {
			E = 0;
			eS = 0;
		}
		System.out.println("O salario do funcionario (código): "+C+" R$ "+(S+eS)+"\n O valor adicional por horas extras foi: R$"+eS);
	}

}
