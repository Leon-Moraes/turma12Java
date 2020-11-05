programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real peso;
		real altura;
		escreva("Codigo de cálculo de IMC","\n")
		escreva("Por favor, entre com sua altura e peso:","\n");
		escreva("Altura: ");
		leia(altura);
		escreva("Peso: ");
		leia(peso);
		real imc = peso / mat.potencia(altura, 2.0);
		
		se(imc < 18.5) {
			escreva("Seu IMC foi de: ",mat.arredondar(imc, 2)," portanto você está abaixo do peso.")
		}senao se(imc >= 18.5 e imc < 25.0){
			escreva("Seu IMC foi de: ",mat.arredondar(imc, 2)," portanto você está no peso normal.")
		}senao se(imc >= 25.0 e imc < 30) {
			escreva("Seu IMC foi de: ",mat.arredondar(imc, 2)," portanto você está acima do peso.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */