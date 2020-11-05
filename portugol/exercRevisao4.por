programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x = 1.0;
		real y
		real somar = 0.0 
		real div = 0.0

		para(y=1.0; y<=50; y++ ){

			x = x + 2;
			div = x/y;
			somar = somar + div
			
			}
		escreva("A soma Total é: ",mat.arredondar(somar, 3 ))	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */