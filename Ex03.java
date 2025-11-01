package ex3;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] notas = new double[4];
	        double soma = 0;

	        for (int i = 0; i < 4; i++) {
	            System.out.print("Digite a nota " + (i + 1) + ": ");
	            notas[i] = sc.nextDouble();
	            soma += notas[i];
	        }

	        double media = soma / 4;

	        System.out.println("\nNotas digitadas:");
	        for (double n : notas) {
	            System.out.println(n);
	        }

	        System.out.printf("\nMédia = %.2f\n", media);
	        sc.close();
	    }
	}