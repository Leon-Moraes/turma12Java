programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro linha = 4;
		const inteiro coluna = 6;
		inteiro n1[linha][coluna];
		inteiro n2[linha][coluna];
		inteiro m1[linha][coluna];
		inteiro m2[linha][coluna];

		inteiro x=0;
		inteiro y=0;

		para( x = 0; x < linha; x++) {
			
			para( y = 0; y < coluna; y++) { 
				escreva("Ensira os Valores da primeira Matris, Linha ", x+1," Coluna ", y+1," : ")
				leia(n1[x][y])
				leia(n2[x][y])
				
			}
			para( y = 0; y < coluna; y++) {
				m2[x][y] = n1[x][y] - n2[x][y];
				m1[x][y] = n1[x][y] + n2[x][y];
				
				se(x == 3 ){
				escreva("A matris m1, que é a soma da primeira e da segunda matris é: \n",m1[x][y], " | ");
				escreva("\nA matris m2, que é a diferença da primeira e da segunda matris é: \n",m2[x][y], " | ");
				
				}
			}
				escreva("\n")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */