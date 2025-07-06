import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name = " ";
        int ddd = 0;
        int phoneNumber = 0;

        System.out.print("Informe o seu nome:");
        name = scanner.nextLine();

        try {
            System.out.print("Informe a seu DDD: ");
            ddd = scanner.nextInt();

            System.out.print("Informe o seu número de telefone: ");
            phoneNumber = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um número válido.");
            scanner.close();
            return;
        }

        // Verifica o DDD
        var isSaoPauloDDD = (ddd >= 11 && ddd <= 19);
        var isMinasGeraisDDD = (ddd >= 31 && ddd <= 38);

        // Formata o número de telefone
        String formattedPhoneNumber =  String.format("(%02d) %d", ddd, phoneNumber);
        // Monta a mensagem de saída
        var message = name + ", o seu número de telefone " + formattedPhoneNumber + " ";
        message += isSaoPauloDDD ? " é da região de São Paulo." : isMinasGeraisDDD ? " é da região de Minas Gerais." : " não é um DDD válido para São Paulo ou Minas Gerais.";

        System.out.println(message);
        System.out.println("Fim da execução!");
        scanner.close();
    }
}
