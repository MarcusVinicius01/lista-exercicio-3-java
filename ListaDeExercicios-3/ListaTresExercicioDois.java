import java.util.Scanner;

public class ListaTresExercicioDois {
    public static void main(String[] args) {
        String usuario = "", senha = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo de leitura de nome e senha do usuário.");

        do {
            System.out.println("\nInforme seu nome de usuário: ");
            usuario = scanner.next();

            System.out.println("\nAgora informe sua senha: ");
            senha = scanner.next();

            if (usuario.equals(senha)) {
                System.out.println("\nNome e senha iguais! Informe um nome e senha diferentes.");
            }
            else {
                System.out.println("\nBem vindo " + usuario);
                break;
            }
        } while (true);
        scanner.close();
    }
}
