import java.util.Scanner;
public class paulistinha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String times[] = {"CORINTHIANS" ,"PALMEIRAS", "SANTOS","SPFC" }; String empate = "";
		int ponto[][] = new int[4][4]; int rodada[] = {1,2,3,4};int totalPontos[] = new int[4];int vencedor = 0; int x; int y; char vitoria; 
		
		System.out.println("TIMES \t\t\t PONTOS");
		for ( x = 0; x<4; x++) {
			System.out.println(times[x]+"\t\t"+ponto[x]);
		}
		for( x = 0; x < 4 ;x++){
			for (y = 0; y < 4; y++) {
				System.out.println("O time "+times[x]+" na rodada "+(rodada[y])+" ganhou, empatou ou perdeu ? (V - vitoria / E - empate / D - derrota)");
				vitoria = input.next().toUpperCase().charAt(0);
				if(vitoria == 'V') {
					ponto[x][y] = ponto[x][y] + 3;
					
				} else if(vitoria == 'E') {
					ponto[x][y] = ponto[x][y] + 1;
				} else {
					ponto[x][y] = 0;
				}
				totalPontos[x]= totalPontos[x] + ponto[x][y];
				
				}
			if(totalPontos[x] > vencedor) {
				vencedor = totalPontos[x];
			}
		}
		for(x = 0; x<4; x++) {
			System.out.print("Time: "+(times[x])+"\tPontos: \n");
			for(y = 0; y<4; y++) {
			System.out.print("Rodada "+(rodada[y])+"\t = "+ponto[x][y]+"\n");
			}
		}
		for ( x = 0; x < 4; x++) {
			if(vencedor == totalPontos[x]) {
				vencedor = x;
			}
		}
		System.out.println("O vencedor do campeonato é: " + times[vencedor]);

	}
}
