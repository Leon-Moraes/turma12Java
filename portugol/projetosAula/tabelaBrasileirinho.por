programa
{
	
	funcao inicio()
	{
		cadeia nomeTime;
		cadeia time1;
		escreva("Entre com o nome do time 1: ")
		leia(time1);
		cadeia time2;
		escreva("Entre com o nome do time 2: ")
		leia(time2);
		cadeia time3;
		escreva("Entre com o nome do time 3: ")
		leia(time3);
		cadeia time4;
		escreva("Entre com o nome do time 4: ")
		leia(time4);

		inteiro contadorRodada = 0;

		logico continua = verdadeiro;
		caracter confirmacao = 's';
		caracter naoContinua = 'n'

		inteiro pontos;
		
		inteiro pTime1 = 0;
		inteiro pTime2 = 0;
		inteiro pTime3 = 0;
		inteiro pTime4 = 0;

		caracter vitoria;
		limpa();
				
			faca{
				contadorRodada = contadorRodada + 1;
				
				escreva("Rodada ",contadorRodada, "\n");
				
				escreva("O time do ",time1," ganhou, perdeu ou empatou ?(G - Ganhou,P - Perdeu,E - Empatou)","\n");
				leia(vitoria);
				se(vitoria == 'G' ou vitoria =='g') {
						pTime1 = pTime1 + 3;

					
					} senao se(vitoria == 'E' ou vitoria =='e') {
						pTime1 = pTime1 + 1;
						
					}
				limpa();
				escreva("O time do  ",time2," ganhou, perdeu ou empatou ?(G - Ganhou,P - Perdeu,E - Empatou)" ,"\n");
				leia(vitoria);
				se(vitoria == 'G' ou vitoria =='g') {
						pTime2 = pTime2 + 3;

					
					} senao se(vitoria == 'E' ou vitoria =='e') {
						pTime2 = pTime2 + 1;
						
					}
				limpa();	
				escreva("O time do ",time3," ganhou, perdeu ou empatou ?(G - Ganhou,P - Perdeu,E - Empatou)", "\n");
				leia(vitoria);
				se(vitoria == 'G' ou vitoria =='g') {
						pTime3 = pTime3 + 3;

					
					} senao se(vitoria == 'E' ou vitoria =='e') {
						pTime3 = pTime3 + 1;
						
					}
				limpa();
				escreva("O time do ",time4," ganhou, perdeu ou empatou ?(G - Ganhou,P - Perdeu,E - Empatou)", "\n");
				leia(vitoria);
				se(vitoria == 'G' ou vitoria =='g') {
						pTime4 = pTime4 + 3;
					limpa();
					
					} senao se(vitoria == 'E' ou vitoria =='g') {
						pTime4 = pTime4 + 1;
						
					}

					
				limpa();
				 escreva("Deseja continuar ?(N/S)");
				 leia(confirmacao)
					se(confirmacao == 'N' ou confirmacao =='n') {
						continua = falso;
					escreva("O time do ",time1," fez ", pTime1," pontos no total","\n");
					escreva("O time do ",time2," fez ", pTime2," pontos no total","\n");
					escreva("O time do ",time3," fez ", pTime3," pontos no total","\n");
					escreva("O time do ",time4," fez ", pTime4," pontos no total","\n");

					escreva("Digite o nome do seu time")
					leia(nomeTime);
					se(nomeTime == time1) {
							limpa();
							escreva("O time do ",nomeTime," tem ", pTime1, " pontos.");
						}senao se(nomeTime == time2) {
							limpa();
							escreva("O time do ",nomeTime," tem ", pTime2, " pontos.");
						}senao se(nomeTime == time3) {
							limpa();
							escreva("O time do ",nomeTime," tem ", pTime3, " pontos.");
						}senao se(nomeTime == time4) {
							limpa();
							escreva("O time do ",nomeTime," tem ", pTime4, " pontos.");
						}
					
					} senao {
						continua = verdadeiro;
						}
				}enquanto(continua == verdadeiro)
					
			
			}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */