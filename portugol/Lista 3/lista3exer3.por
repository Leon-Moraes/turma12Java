programa
{
	
	funcao inicio()
	{
		inteiro numero;
		escreva("Ensira um numero: ")
		leia (numero);
		
		inteiro somaNumero = 0;
		inteiro mediaNumero = 0;
		inteiro totalDeNumeros = 0;
		limpa();

			enquanto (numero > 0) {

				
				
				somaNumero = somaNumero + numero;
				escreva("A soma dos numero obtidos até aqui é: ", somaNumero,"\n");
				escreva("Escreva o proximo: ")
				leia (numero);	
				limpa();

				totalDeNumeros = totalDeNumeros + 1;

				mediaNumero = somaNumero / totalDeNumeros;
				se (numero < 0) {
					escreva("A soma de todos os valores positivos adicionados, foi de: ",somaNumero, "\n") 
					escreva("O total de numeros inseridos, foi: ", totalDeNumeros, "\n")
					escreva("E a média da soma dos valores inseridos, é de: ", mediaNumero) 
				}

						
			} 
			
	}
			
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */