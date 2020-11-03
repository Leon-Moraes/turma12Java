programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro lancamentos = 10;
		inteiro tentativas[lancamentos];
		inteiro x;[
		inteiro mediaLancamentos = 0;
		inteiro somaLancamentos = 0;
		inteiro maiorResultado = 0;

		para(x = 0;x < lancamentos; x++) {
			tentativas[x] = Util.sorteia(1, 6);
			escreva("Tentativa de numero ",x+1," deu: ", tentativas[x],"\n");
			somaLancamentos = somaLancamentos + tentativas[x]
	
			se (tentativas[x] >= maiorResultado) {
					maiorResultado = tentativas[x]
				}		
			}
		para(x = 0; x < lancamentos; x++) {
			mediaLancamentos =  (somaLancamentos / lancamentos);
			se(x == 9) {
				escreva("A media do resultado dos lancamentos foi de: ", mediaLancamentos,"\n")
				escreva("E o maior valor entre os resultados foi de: ",maiorResultado)
			}
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */