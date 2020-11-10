public class exercicio2 {
	
	public static void main(String[] args) {
		int x = 0;
		int pares = 0;
		int impares = 0;
		for( x= 0; x <= 500; x++ ) {
			if((x % 2) == 0) {
				pares = pares + x;
			}
			if((x % 2) != 0 ) {
				impares = impares + x;
			}
			
		}
		System.out.println("A soma de todos os numeros pares de 0 a 500 é: "+pares);
		System.out.println("A soma de todos os numeros impares de 0 a 500 é: "+impares);
	}

}
