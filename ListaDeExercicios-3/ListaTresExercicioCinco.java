public class ListaTresExercicioCinco {
    public static void main(String[] args) {
        
        System.out.println("Algoritimo para imprimir na tela apenas os números ímpares entre 1 e 50");

        for (int numero = 1; numero <= 50; numero++) {

            if (numero % 2 != 0)
            System.out.println("\nNúmero impar: " + numero);
        }
    }
}
