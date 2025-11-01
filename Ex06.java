package ex6;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] medias = new double[10];
	        int aprovados = 0;

	        for (int aluno = 0; aluno < 10; aluno++) {
	            double soma = 0;
	            System.out.println("\nAluno " + (aluno + 1));
	            for (int n = 1; n <= 4; n++) {
	                System.out.print("Digite a nota " + n + ": ");
	                soma += sc.nextDouble();
	            }
	            medias[aluno] = soma / 4;
	            if (medias[aluno] >= 7.0)
	                aprovados++;
	        }

	        System.out.println("\nMédias dos alunos:");
	        for (double m : medias) System.out.printf("%.2f ", m);
	        System.out.println("\nAlunos com média >= 7.0: " + aprovados);

	        sc.close();
	    }
	}