import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com a duração do evento em segundos: ");
		int sec; sec = input.nextInt(); int min = (sec / 60); int hour = (min / 60); sec = ((sec % 3600)/60);
		System.out.println("O tempo de duração do evento foi de: "+hour+" Horas, "+min+" Minutos e "+sec+" Segundos.");
	}

}
