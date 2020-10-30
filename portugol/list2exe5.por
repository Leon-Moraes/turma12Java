programa
{
	
	funcao inicio() {
		
		real indice;
		escreva("Ensira o indice de poluição: ");
		leia(indice);
		
		se(indice > 0.5) {
			escreva("Erro! Ensira novamente um indice entre 0.0 e 0.5:  ");
			indice = 0;
			leia (indice);

			se (indice >= 0.3 e indice < 0.4) {
				escreva("Emitir intimação para a suspenção das atividades da industria 1");
			}senao se (indice >= 0.4 e indice < 0.5) {
				escreva("Emitir intimação para a suspenção das atividades das industrias 1 e 2");
			}senao se(indice == 0.5) {
				escreva("Indice muito alto, emitir notificação de suspenção de atividades para todas as industrias");
			} senao {
				escreva("Indice dentro dos padrões de qualidade");
					}
		} senao {
			se (indice >= 0.3 e indice < 0.4) {
				escreva("Emitir intimação para a suspenção das atividades da industria 1");
			}senao se (indice >= 0.4 e indice < 0.5) {
				escreva(" Emitir intimação para a suspenção das atividades das industrias 1 e 2");
			}senao se(indice == 0.5) {
				escreva(" Indice muito alto, emitir notificação de suspenção de atividades para todas as industrias");
			} senao {
				escreva(" Indice dentro dos padrões de qualidade");
				}
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */