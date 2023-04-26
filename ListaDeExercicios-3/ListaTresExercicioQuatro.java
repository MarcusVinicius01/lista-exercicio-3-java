import java.util.Scanner;

public class ListaTresExercicioQuatro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algarismo para calcular a soma e a média de 5 números.");

        System.out.println("\nInforme o primeiro número: ");
        int primeiroN = scanner.nextInt();

        System.out.println("\nInforme o sugundo número: ");
        int segundoN = scanner.nextInt();

        System.out.println("\nInforme o terceiro número: ");
        int terceiroN = scanner.nextInt();

        System.out.println("\nInforme o quarto número: ");
        int quartoN = scanner.nextInt();

        System.out.println("\nInforme o quinto número: ");
        int quintoN = scanner.nextInt();

        int soma = primeiroN + segundoN + terceiroN + quartoN + quintoN;
        double media = (primeiroN + segundoN + terceiroN + quartoN + quintoN) / 5;

        System.out.println("\nA soma dos 5 números é de " + soma + ". E sua média é de " + media);
        scanner.close();
    }
}
