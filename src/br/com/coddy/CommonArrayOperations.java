package br.com.coddy;
import java.util.Scanner;

public class CommonArrayOperations {
	public static double[] calculateStats(int[] arr) {
	        // Write your code here
	    	int sum = 0;
	    	for(int number : arr) {
	    		sum += number;
	    	}
	    	double avarege = (double) sum / arr.length;
	    	
	    	int max = arr[0];
	    	for(int i = 1; i < arr.length; i++) {
	    		if(arr[i] > max) {
	    			max = arr[i];
	    		}
	    	}
	    	
	    	int min = arr[0];
	    	for(int i = 1; i < arr.length; i++) {
	    		if(arr[i] < min) {
	    			min = arr[i];
	    		}
	    	}
	    	
	    	double [] resultado =  {(double) sum, avarege, (double) max, (double) min};
	    	return resultado;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String text = scanner.nextLine();
	        String[] arrString = text.split(",");
	        int[] numbers = new int[arrString.length];
	        for (int i = 0; i < arrString.length; i++) {
	           numbers[i] = Integer.parseInt(arrString[i]);
	        }
	        double[] stats = calculateStats(numbers);
	        System.out.println("Sum: " + stats[0]);
	        System.out.println("Average: " + stats[1]);
	        System.out.println("Maximum: " + stats[2]);
	        System.out.println("Minimum: " + stats[3]);
	    }
}
/*
 * Desafio

Fácil
Crie um método chamado calculateStats que recebe um array de inteiros como entrada e realiza as seguintes operações:

Calcula a soma de todos os elementos no array.
Calcula a média dos elementos no array.
Encontra o elemento máximo no array.
Encontra o elemento mínimo no array.
O método deve retornar um array de doubles contendo a soma, média, máximo e mínimo, nessa ordem.

====================================

Saída Esperada

Sum: 15.0
Average: 3.0
Maximum: 5.0
Minimum: 1.0

====================================

Entrada

1,2,3,4,5
*/