import java.util.Scanner;
public class exercicio2 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double altura;
		double peso;
		
		System.out.println("Entre com a sua altura e peso:�");
		System.out.println("Altura: ");
		altura = input.nextDouble();
		System.out.println("Peso: ");
		peso = input.nextDouble();
		
		double imc = Math.round((peso/ Math.pow(altura, 3)));;
		if(imc < 18.5) {
			System.out.println("IMC:"+imc);
			System.out.println("Voc� est� abaixo do peso");
		}
		if(imc >=18.5 && imc < 25.0) {
			System.out.println("IMC:"+imc);
			System.out.println("Voc� est� no peso ideal");
		}
		if(imc >=25.0 && imc < 30.0) {
			System.out.println("IMC:"+imc);
			System.out.println("Voc� est� acima do peso");
		}
		if(imc >= 35.0) {
			System.out.println("IMC:"+imc);
			System.out.println("Pessoa com condi��o de obesidade");
		}
	}
}
