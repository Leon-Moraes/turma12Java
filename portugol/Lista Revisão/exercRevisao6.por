programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[3]
		inteiro matriz[3][3]
		inteiro x;
		inteiro y;

			para (x = 0; x<3; x++)
		{
			para (y = 0; y<3; y++)
			{
				matriz[x][y] = Util.sorteia(1, 9)
			}
		}	
		para (x = 0; x<3; x++)// linha
		{
			vetor [x] = Util.sorteia(1, 9)			
		}		
		escreva ("Matriz:\n")			
		para (x = 0; x<3; x++)
		{
			para (y = 0; y<3; y++)
			{	
			escreva (matriz[x][y])
				escreva (" ")
			}
			escreva ("\n")			
		}
		escreva ("\n","Vetor:\n")
		para (x = 0; x<3; x++)
		{
			escreva (vetor[x]+" ")			
		}
		escreva ("\n")
		escreva ("\n","Multiplicação(Vetor*Matriz(Coluna):","\n")
		
		vetor[0] = vetor[0] * matriz[0][0]
		vetor[1] = vetor[1] * matriz[0][1]
		vetor[2] = vetor[2] * matriz[0][2]
		
		para (x = 0; x<3; x++)
		{			
			escreva (vetor[x]+" ")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */