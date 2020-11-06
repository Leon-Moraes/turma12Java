programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real vetor[5];
		inteiro x = 0
		inteiro codigo;

		para(x = 0; x < 5; x++){
			escreva("Entre com o valor para o vetores ",x,": ")
		leia(vetor[x]);
		}
		
		para(x = 0; x < 5; x++){
		escreva("Insira o código de exibição: (1/2)");
		leia(codigo);
		se(codigo == 1){
			para(x = 0; x < 5; x++){
				
				escreva(vetor[x],"\n")
			}
		}senao se(codigo == 2){
			para(x = 4; x >= 0; x--){
				escreva(vetor[x],"\n")
			}
		}senao{
			escreva("O codigo de exi")
			pare;
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 541; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */