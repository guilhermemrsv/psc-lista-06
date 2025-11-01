package ex5;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int p = 0, i = 0;

        for (int x = 0; x < 20; x++) {
            System.out.print("Digite o número " + (x + 1) + ": ");
            numeros[x] = sc.nextInt();

            if (numeros[x] % 2 == 0)
                pares[p++] = numeros[x];
            else
                impares[i++] = numeros[x];
        }

        System.out.println("\nTodos os números:");
        for (int n : numeros) System.out.print(n + " ");
        System.out.println("\nPares:");
        for (int j = 0; j < p; j++) System.out.print(pares[j] + " ");
        System.out.println("\nÍmpares:");
        for (int j = 0; j < i; j++) System.out.print(impares[j] + " ");

        sc.close();
    }
}