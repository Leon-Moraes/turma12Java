import java.util.Scanner;
public class triangulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	   double triangulo1;	 double triangulo2;    double base;   double altura;	double maiorTriangulo;
	
	   System.out.println("Entre com o valor de altura e base do triangulo 1:" );
	   System.out.println("ALTURA: ");
	   altura = input.nextDouble();
	   System.out.println("BASE: ");
	   base = input.nextDouble();
	   if(base <= 0.0 && altura <=0.0) {
		   System.out.println("Valor invalido, entre novamente com o valor");
		   System.out.println("ALTURA: ");
		   altura = input.nextDouble();
		   System.out.println("BASE: ");
		   base = input.nextDouble();
	   }
	   triangulo1 =((base * altura) /2.0);
	   triangulo1= Math.round(triangulo1);
	   System.out.println("Entre com o valor de altura e base do triangulo 2:" );
	   System.out.println("ALTURA: ");
	   altura = input.nextDouble();
	   System.out.println("BASE: ");
	   base = input.nextDouble();
	   
	   if(base <= 0.0 && altura <=0.0) {
		   System.out.println("Valor invalido, entre novamente com o valor");
		   System.out.println("ALTURA: ");
		   altura = input.nextDouble();
		   System.out.println("BASE: ");
		   base = input.nextDouble();
	   }
	   triangulo2=((base * altura)/2.0);
	   triangulo2= Math.round(triangulo2);
	   System.out.println("VALOR AREA TRIANGULO 1: "+triangulo1);
	   System.out.println("VALOR AREA TRIANGULO 2: "+triangulo2);
		if(triangulo1 > triangulo2) {
			System.out.print("VALOR AREA TRIANGULO 1 é MAIOR QUE DO TRIANGULO 2.");
		}else if(triangulo1 == triangulo2){
			System.out.println("VALOR AREA DOS TRIANGULOS É IGUAL.");
		} else {
			System.out.println("VALOR AREA TRIANGULO 2 É MAIOR QUE DO TRIANGULO 1.");
		}
	}
}