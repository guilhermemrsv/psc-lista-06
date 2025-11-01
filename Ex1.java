package ex01;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        input.close();
    }
}
