import java.util.Scanner;

public class ExtBasico {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
		 * Efetue a soma de A e B atribuindo o seu resultado na variável X. 
		 * Imprima X conforme X=Resultado. Não apresente mensagem alguma além 
		 * daquilo que está sendo especificado e não esqueça de imprimir o 
		 * fim de linha após o resultado
		 */
		
		Scanner insere = new Scanner (System.in);
	      
	      int A = insere.nextInt();
	      int B = insere.nextInt();
	      
	      int X;
	      X = A + B;
	      
	      System.out.println("X = " + X);

	}

}
