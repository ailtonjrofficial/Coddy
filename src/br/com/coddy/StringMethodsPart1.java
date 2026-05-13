package br.com.coddy;
import java.util.Scanner;

public class StringMethodsPart1 {
		public static void analyzeString(String str) {
			int length = str.length();
			char indexFour = str.charAt(4);
			String indexSeven = str.substring(7);
			String indexThree = str.substring(3, 6);
			boolean WithoutDotCom = str.endsWith(".");
			String convertida = str.toUpperCase();
			System.out.println("Length: " + length);
			System.out.println("Char at 4: " + indexFour);
			System.out.println("Substring: " + indexSeven);
			System.out.println("Substring 2: " + indexThree);
			System.out.println("Ends with dot: " + WithoutDotCom);
			System.out.println("Uppercase: " + convertida);
			
		}

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String message = scanner.nextLine();
	        analyzeString(message);
	    }
}
/*
Desafio

Fácil
Crie um método chamado analyzeString que recebe uma string como entrada e imprime a seguinte análise usando métodos de string:

O comprimento da string
O caractere no índice 4
A substring começando do índice 7 até o final
A substring do índice 3 até, mas não incluindo, o índice 6
Se a string termina com um ponto .
A string convertida para maiúsculas
A saída deve seguir exatamente este formato:

Length: [The length]
Char at 4: [The Char at index 4]
Substring: [The First substring]
Substring 2: [The Second substring]
Ends with dot: [true or false]
Uppercase: [The string in uppercase]
==========================================
Saída Esperada

Length: 40
Char at 4:  
Substring: eak English in the United States.
Substring 2: y s
Ends with dot: true
Uppercase: THEY SPEAK ENGLISH IN THE UNITED STATES.
==========================================
Entrada

They speak English in the United States.

*/