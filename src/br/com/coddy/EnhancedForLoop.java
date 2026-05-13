package br.com.coddy;

public class EnhancedForLoop {
	public static void main(String[] args) {
        // Initialize the fruits array
        String [] fruits = {"apple", "banana", "orange", "grape","kiwi"};
        
        // Use an enhanced for loop to iterate over the array
        for(String mostrar: fruits) {
        	System.out.println(mostrar.toUpperCase());
        }
    }
}

/*
Desafio

Fácil
Crie um programa que faça o seguinte:

Inicializa um array de strings chamado fruits com os valores "apple", "banana", "orange", "grape" e "kiwi".
Usa um laço for aprimorado para iterar sobre o array fruits.
Em cada iteração, imprime a fruta atual em maiúsculas usando o método toUpperCase(): someString.toUpperCase()

=====================================
Saída Esperada

APPLE
BANANA
ORANGE
GRAPE
KIWI
 */