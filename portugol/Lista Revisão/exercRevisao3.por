programa
{
	
	funcao inicio()
	{
		inteiro numero = 0
		caracter parar
		inteiro contador1 = 0;
		inteiro contador2 = 0;
		inteiro contador3 = 0;
		inteiro contador4 = 0;

		enquanto (numero >=0){
			escreva("Ensira um numero: ")
			leia(numero)
			se(numero >= 0 e numero <= 25) {
					contador1 = contador1 + 1;
			}senao se (numero > 25 e numero <= 50) {
				contador2 = contador2 + 1;
			}senao se (numero > 50 e numero <= 75) {
				contador3 = contador3 + 1
			}senao se (numero > 75 e numero <=100) {
				contador4 = contador4 + 1;
			}
			escreva("Deseja inserir mais numeros ? (S/N) ")
			leia(parar);

			se(parar == 'S' ou parar =='s'){	
			}senao{

				escreva("A quantidade de numeros entre 0 e 25 é: ",contador1,"\n")
				escreva("A quantidade de numeros entre 26 e 50 é: ",contador2,"\n")
				escreva("A quantidade de numeros entre 51 e 75 é: ",contador3,"\n")
				escreva("A quantidade de numeros entre 76 e 100 é: ",contador4,"\n")
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
 * @POSICAO-CURSOR = 947; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */