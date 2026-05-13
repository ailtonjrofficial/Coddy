package br.com.coddy;

public class MutinyMessageManipulation {
	public static String decodeMessage(String message) {
        // Write code here
		StringBuilder sb = new StringBuilder(message);
		String invertido = sb.reverse().toString().replace('a', '*').replace('m', '#');
		return invertido;
    }
}

/*
Desafio

Fácil
Crie uma função chamada decodeMessage que recebe message como seu parâmetro.

Esta função decodifica uma mensagem secreta ao:

Inverter a string.
Substituir 'a' por '*'.
Substituir 'm' por '#'.
Parâmetro:

message (String): A mensagem codificada consistindo de caracteres alfabéticos minúsculos.
A função retorna a mensagem decodificada como uma String.

=====================

Saída Esperada

#*d*#
 */