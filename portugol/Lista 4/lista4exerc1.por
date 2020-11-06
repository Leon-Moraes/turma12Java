programa
{
	
	funcao inicio()
	{
		inteiro vetor[5];
		inteiro x = 0;
		inteiro maiorValor = 0;
		inteiro contadorMaior = 0
		

		para( x = 0; x < 5; x++) {
			escreva("Entre com os valores: ");
			leia(vetor[x]);
			limpa();
			
 				
 		}
 		para(x = 0; x < 5; x++) {
 			
			escreva("Valor da posição ", x," é: ", vetor[x],"\n");
			
			se (vetor[x] >= maiorValor;) {
				
				se(vetor[x] != maiorValor){
					contadorMaior = 0;
					}
				maiorValor = vetor[x]
				contadorMaior++;
				
			}
		}
		escreva("E o maior valor inserido é de: ", maiorValor);
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */