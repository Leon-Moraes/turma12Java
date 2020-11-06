programa
{	
	funcao inicio()
	{
		inteiro tempoEmSegundo;
		inteiro minuto = 60;
		inteiro hora = 60;
		escreva("Entre com o a duração do evento em segundos: ");
		leia (tempoEmSegundo);
		
		real tempoPorMinuto = (tempoEmSegundo % minuto)/60;
		inteiro tempoPorHora = tempoPorMinuto % hora;
		
	

		escreva("O evento durou ",tempoPorHora," horas e ",tempoPorMinuto," minutos.");
		

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */