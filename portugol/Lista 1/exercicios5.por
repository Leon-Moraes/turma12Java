programa
{
	
	funcao inicio()
	{
		
		 real custoDeFabrica;
		 escreva ("Entre com o custo de Fábricação do automóvel: ");
		 leia (custoDeFabrica);
		 
		 real distribuidor = (custoDeFabrica * 0.28) ;
		 real imposto = (custoDeFabrica * 0.45);
		 real custoConsumidor = custoDeFabrica + distribuidor + imposto;
		 escreva ("O custo final ao consumidor é de: R$ ", custoConsumidor);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */