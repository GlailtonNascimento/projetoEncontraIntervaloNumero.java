import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        String nome;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o Seu Nome?: ");
        nome = leitorScanner.nextLine();

        System.out.println(nome + ", Digite o numero que deseja?:");
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println(nome + " o Numero: " + numero + ", Esta no Intervalo.");
        } else {
            System.out.println(nome + " o Numero: " + numero + ", Não esta no Intervalo.");
        }
    }
}