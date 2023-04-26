import java.util.Scanner;

class ListaTresExercicioUm {
    public static void main(String[] args) {
        int nota;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo para pedir nota de zero a dez, até ser uma nota valida.");

        do {
            System.out.println("\nInforme a nota: ");
        nota = scanner.nextInt();

        if (nota > 10){
            System.out.println("Nota Invalida! Informe uma nota entre 0 e 10.");
        }
        } while (nota > 10);
        return;
    }
}