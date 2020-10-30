programa
{
	
	funcao inicio()
	{		
		real salario;
		real maiorSalario = 0.0 ;
		real totalSalario = 0.0 ;
		real mediaSalario;
		real percentual = 0.0;
		real mediaFilhos = 0.0;
		inteiro numeroHabitantes = 0;
		inteiro numeroDeSalarios;
		inteiro filhos;
		inteiro totalFilhos = 0;
		inteiro totalHabitantes = 20;
		
		
			
		para (inteiro habitante = 1; habitante <=20; habitante++) {
		
			escreva("Escreva o salario do habitante numero ", habitante, ":");
			leia (salario);
			limpa();
			escreva("Escreva o numero de filhos do habitante numero ", habitante, ":")
			leia (filhos);
			limpa();

			se(maiorSalario <= salario) {
				maiorSalario = salario;
			}
			se(salario < 100) {
				numeroHabitantes = numeroHabitantes + 1;
			}
			totalFilhos = totalFilhos + filhos;
			totalSalario = totalSalario + salario;
		}
		
		mediaSalario = totalSalario / 20;
		mediaFilhos = (totalFilhos / 20.0);
		percentual =  (numeroHabitantes * 100.0) / 20;

		
		escreva("A média salarial entre os habitantes da cidade é: R$ ", mediaSalario,"\n");
		escreva("O maior salario entre os habitantes é de: R$", maiorSalario, "\n");
		escreva("A média de filhos entre os habitantes é de: ", mediaFilhos,"\n");
		escreva("O percentual de habitantes com salario acima de/ou 100 é de: ", percentual, "%");
				
	}
			
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {totalFilhos, 15, 10, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */