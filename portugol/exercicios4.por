programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3;
		real peso1 = 2, peso2 = 3, peso3 = 5;
		real totalDeNotas = 3;
	
		escreva ("Enserir notas de aluno: ");
		
		leia (nota1, nota2, nota3);


		real notaPonderada1 = (nota1 * peso1);
		real notaPonderada2 = (nota2 * peso2);
		real notaPonderada3 = (nota3 * peso3);

		real media = ((notaPonderada1 + notaPonderada2 + notaPonderada3) / totalDeNotas);

		escreva ("A media do aluno é: ", media);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */