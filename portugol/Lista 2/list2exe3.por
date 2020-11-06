programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio() {
		inteiro n1;
		
		inteiro n2;
			
		inteiro n3;
			
		inteiro n4; 
			
			escreva("Adicionei o primeiro numero: ");
		leia (n1);
			escreva("Adicionei o primeiro segundo: ");
		leia (n2);
			escreva("Adicionei o primeiro terceiro: ");
		leia (n3);
			escreva("Adicionei o primeiro quarto: ");
		leia (n4);

		inteiro quadrado1 = mat.potencia(n1,2);
		inteiro quadrado2 = mat.potencia(n2,2);
		inteiro quadrado3 = mat.potencia(n3,2);
		inteiro quadrado4 = mat.potencia(n4,2);

			se (quadrado3 >= 1000) {
				escreva("O quadrado do terceiro numero é: ", quadrado3);
				

						
			} senao {
				escreva("O quadrado do primeiro, segundo e quarto numeros, respectivamente são: ", quadrado1, " ", quadrado2, " ", quadrado4);
			}
		}
}
		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */