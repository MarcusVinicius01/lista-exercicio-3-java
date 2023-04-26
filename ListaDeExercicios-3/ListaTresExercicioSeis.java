import java.util.Scanner;

public class ListaTresExercicioSeis {
    public static void main(String[] args) {
        int numeroA, numeroB, maior, menor, intervalo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo  que recebe dois números inteiros e gera os números inteiros que estão no intervalo compreendido por eles.");

        System.out.println("\nInforme o primeiro número inteiro: ");
        numeroA = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        numeroB = scanner.nextInt();

        if (numeroA > numeroB) {
            maior = numeroA;
            menor = numeroB;
        }
        else {
            maior = numeroB;
            menor = numeroA;
        }

        for (intervalo = menor + 1; intervalo < maior; intervalo++) {
            System.out.println("Número: " + intervalo);
        }
        scanner.close();
    }
}
