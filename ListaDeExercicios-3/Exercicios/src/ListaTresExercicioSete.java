import java.util.Scanner;

public class ListaTresExercicioSete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo que informa quais dos 7 números são pares e quis são impares.");

        System.out.println("\nInforme o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nInforme o terceiro número: ");
        int numero3 = scanner.nextInt();

        System.out.println("\nInforme o quarto número: ");
        int numero4 = scanner.nextInt();

        System.out.println("\nInforme o quinto número: ");
        int numero5 = scanner.nextInt();

        System.out.println("\nInforme o sexto número: ");
        int numero6 = scanner.nextInt();

        System.out.println("\nInforme o setimo número: ");
        int numero7 = scanner.nextInt();

        if (numero1 %2 == 0) {
            System.out.println("\n" + numero1 + " é um número par.");
        }
        else {
            System.out.println("\n" + numero1 + " é um número impar.");
        }

        if (numero2 %2 == 0) {
            System.out.println(numero2 + " é um número par.");
        }
        else {
            System.out.println(numero2 + " é um número impar.");
        }

        if (numero3 %2 == 0) {
            System.out.println(numero3 + " é um número par.");
        }
        else {
            System.out.println(numero3 + " é um número impar.");
        }

        if (numero4 %2 == 0) {
            System.out.println(numero4 + " é um número par.");
        }
        else {
            System.out.println(numero4 + " é um número impar.");
        }

        if (numero5 %2 == 0) {
            System.out.println(numero5 + " é um número par.");
        }
        else {
            System.out.println(numero5 + " é um número impar.");
        }

        if (numero6 %2 == 0) {
            System.out.println(numero6 + " é um número par.");
        }
        else {
            System.out.println(numero6 + " é um número impar.");
        }

        if (numero7 %2 == 0) {
            System.out.println(numero7 + " é um número par.");
        }
        else {
            System.out.println(numero7 + " é um número impar.");
        }
        scanner.close();
    }
}
