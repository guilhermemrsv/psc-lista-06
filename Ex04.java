package ex4;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o caractere " + (i + 1) + ": ");
            letras[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("\nConsoantes digitadas:");
        for (char c : letras) {
            if ("bcdfghjklmnpqrstvwxyz".indexOf(c) != -1) {
                System.out.print(c + " ");
                cont++;
            }
        }

        System.out.println("\nTotal de consoantes: " + cont);
        sc.close();
    }
}