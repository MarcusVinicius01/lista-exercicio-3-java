import java.util.Scanner;

public class ListaTresExercicioTres {
    public static void main(String[] args) {
        int idade, salario;
        String nome;
        char sexo, estadoCivil;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo para ler e validar informações.");

        do {System.out.println("\nInforme seu nome: ");
        nome = scanner.next();
        if (nome.length() <= 3) {
            System.out.println("Nome inválido! Informe um nome com mais de 3 caractéres");
        }
        } while (nome.length() <= 3);

        do {
            System.out.println("\nInforme sua Idade: ");
            idade = scanner.nextInt();

            if (idade > 150 || idade <= 0){
                System.out.println("Idade Invalida! informe uma idade entre 0 e 150.");
            }
        } while (idade > 150 || idade <= 0); 

        do {
            System.out.println("\nInforme seu salário: ");
            salario = scanner.nextInt();

            if (salario == 0){
                System.out.println("\nSalário Invalido! informe um salário maior que 0.");
            }
        } while (salario == 0); 

        do {
            System.out.println("\nInforme seu sexo: \n[f]Feminino.\n[m]Masculino.");
            sexo = scanner.next().charAt(0);

            if (sexo != 'f' && sexo != 'm') {
                System.out.println("\nInformação Invalida!");
            }
        } while (sexo != 'f' && sexo != 'm'); 

        do {
            System.out.println("\nInforme seu Estado Civil: \n[s]Solteiro.\n[c]Casado.\n[v]Viúvo.\n[d]Divorciado.");
            estadoCivil = scanner.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("\nInformação Invalida!");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'); 

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civíl: " + estadoCivil);
        scanner.close();
    }
}
