programa
{
	
	funcao inicio()
	{
		real C;
		escreva("Entre com o código do funcionario: ");
		leia (C);
		real N;
		escreva("Entre com o numero de horas trabalhadas do funcionario: ");
		leia (N);
		
		real S = (N * 10.00);
		real E;
		real salarioTotal;
		se (N > 50 ){
			E = ( N - 50) * 20.00;
			salarioTotal = (E + S);
			escreva("O salario total do funcionario é de R$ ", salarioTotal, " e o valor da hora excedente foi de R$ " + E);
		} senao {
			E = 0;
		}

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */