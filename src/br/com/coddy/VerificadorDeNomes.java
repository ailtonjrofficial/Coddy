package br.com.coddy;

public class VerificadorDeNomes {
	public static String checkLength(String arr) {
		int tam = arr.length();
		boolean tam2 = tam >= 6;
		return "Username length: " + tam + "\nLong enough: " + tam2;

	}

	public static String checkStart(String arr) {
		boolean user = arr.startsWith("user_");
		boolean adm = arr.startsWith("admin_");
		return "Starts with user_: " + user + "\nStarts with admin_: " + adm;
	}

	public static String modifyUsername(String arr) {
		String ob = arr.substring(0, 5);
		String convert = ob.toUpperCase();
		return "First 5 chars: " + ob + "\nUppercase: " + convert;
	}

	public static void main(String[] args) {
		// Test with this username
		String username = "user_123admin";

		System.out.println("Length Check:");
		System.out.println(checkLength(username));

		System.out.println("\nPrefix Check:");
		System.out.println(checkStart(username));

		System.out.println("\nModified Username:");
		System.out.println(modifyUsername(username));
	}
}
/*
 * Desafio
 * 
 * Fácil Crie um verificador de nome de usuário com três métodos que usam
 * métodos de String:
 ****************************************************
 * 
 * 
 * Crie o método checkLength que:
 * 
 * Recebe uma String de nome de usuário Retorna mensagem no formato:
 * 
 * Username length: 8 Long enough: true (Suficientemente longo significa
 * comprimento >= 6)
 ****************************************************
 * 
 * 
 * Crie o método checkStart que:
 * 
 * Recebe uma String de nome de usuário Verifica se começa com "user_" ou
 * "admin_" Retorna mensagem no formato:
 * 
 * Starts with user_: true Starts with admin_: false
 ****************************************************
 * 
 * 
 * Crie o método modifyUsername que:
 * 
 * Recebe uma String de nome de usuário Obtém os primeiros 5 caracteres usando
 * substring Converte para maiúsculas Retorna mensagem no formato:
 * 
 * First 5 chars: admin Uppercase: ADMIN
 * 
 * ======================================================
 * 
 * Saída Esperada
 * 
 * Length Check: Username length: 13 Long enough: true
 * 
 * Prefix Check: Starts with user_: true Starts with admin_: false
 * 
 * Modified Username: First 5 chars: user_ Uppercase: USER_
 */
