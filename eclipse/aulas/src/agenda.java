import java.util.Scanner;
public class agenda {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String tarefa; int x =0;
		String agenda[][] = new String[5][31];  int dia; 
		System.out.println("Insira o dia a ser agendada a tarefa:");	
		dia = input.nextInt();
		System.out.print("Insira a "+(x+1)+"ª tarefa do dia");
		for(  x = 0;x<5 ; x++) {
			agenda[x][dia+1] = input.nextLine();
		}
	}
}
