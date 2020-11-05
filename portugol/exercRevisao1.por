programa
{
	
	funcao inicio()
	{
		cadeia produto;
		real etiqueta;
		real pagamento;
		
		escreva("Entre com o preço do produto: ");
		leia(etiqueta);
		escreva("Escolha a forma de pagamento","\n","1 = debito\n","2 = credito\n","3 = parcelado 2x\n","4 = parcelado x3","\n");
		leia(pagamento);
		real debito = etiqueta - (etiqueta * 0.2);
		real credito = etiqueta - (etiqueta * 0.15);
		real parcelado2 = etiqueta / 2;
		real parcelado3 = ((etiqueta + (etiqueta * 0.1)) /3);

		se(pagamento == 1){
			escreva("Valor a pagar: R$",debito)
		}senao se(pagamento == 2){
			escreva("Valor a pagar: R$",credito)
		}senao se(pagamento == 3) {
			escreva("Valor a pagar: R$",parcelado2," em 2 vezes")
		}senao se(pagamento == 4) {
			escreva("Valor a pagar: R$",parcelado3," em 3 vezes")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 781; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */