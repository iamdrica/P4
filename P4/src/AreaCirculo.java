import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		/* A fórmula para calcular a área de uma circunferência é: 
		 * area = π . raio2. Considerando para este problema que π = 3.14159:
		 * Efetue o cálculo da área, elevando o valor de raio ao quadrado e
		 *  multiplicando por π.
		 */

		// pi = 3.14159;
	    // area = pi * raio * raio;
	    
	    double pi = 3.14159;
	    
	    Scanner insere = new Scanner(System.in); 
	    
	    double raio = insere.nextDouble(); // valor inserido pelo usuario;
	    double area=pi*raio*raio;
	    
	        System.out.println(String.format("A=%.4f" ,(area)));
	}

}
