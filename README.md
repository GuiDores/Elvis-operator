# Elvis-operator
Exemplo de Elvis operator em java
Aplicativo de Verificação de Telefone Java
Este é um pequeno aplicativo Java de linha de comando que solicita ao usuário seu nome, DDD (código de área) e número de telefone. Ele então formata o número de telefone e verifica se o DDD corresponde às regiões de São Paulo ou Minas Gerais, exibindo uma mensagem correspondente.

Funcionalidades
Coleta o nome do usuário.

Coleta o DDD e o número de telefone.

Inclui tratamento de erro para entrada inválida (não numérica) para DDD e número de telefone.

Formata o número de telefone no padrão (DD) Número.

Verifica se o DDD está dentro dos intervalos para São Paulo (11-19) ou Minas Gerais (31-38).

Exibe uma mensagem personalizada com base na validação do DDD.

Como Compilar e Executar
Para compilar e executar este aplicativo, você precisará ter o Java Development Kit (JDK) instalado em sua máquina.

1. Salve o Código
Salve o código fornecido em um arquivo chamado App.java.

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
        String formattedPhoneNumber = String.format("(%02d) %d", ddd, phoneNumber);
        // Monta a mensagem de saída
        var message = name + ", o seu número de telefone " + formattedPhoneNumber + " ";
        message += isSaoPauloDDD ? " é da região de São Paulo." : isMinasGeraisDDD ? " é da região de Minas Gerais." : " não é um DDD válido para São Paulo ou Minas Gerais.";

        System.out.println(message);
        System.out.println("Fim da execução!");
        scanner.close();
    }
}

2. Abra o Terminal ou Prompt de Comando
Navegue até o diretório onde você salvou o arquivo App.java.

3. Compile o Código
Use o compilador Java (javac) para compilar o arquivo:

javac App.java

Se a compilação for bem-sucedida, um arquivo App.class será gerado no mesmo diretório.

4. Execute o Aplicativo
Use o interpretador Java (java) para executar o aplicativo:

java App

Exemplo de Uso
Ao executar o aplicativo, você será solicitado a fornecer as seguintes informações:

Informe o seu nome: [Seu Nome]
Informe a seu DDD: [Seu DDD]
Informe o seu número de telefone: [Seu Número de Telefone]

Saída Esperada
Para um DDD de São Paulo:

João, o seu número de telefone (11) 987654321 é da região de São Paulo.
Fim da execução!

Para um DDD de Minas Gerais:

Maria, o seu número de telefone (31) 912345678 é da região de Minas Gerais.
Fim da execução!

Para um DDD que não seja de São Paulo ou Minas Gerais:

Carlos, o seu número de telefone (21) 998877665 não é um DDD válido para São Paulo ou Minas Gerais.
Fim da execução!

Para entrada inválida (não numérica) para DDD ou telefone:

Informe o seu nome: Ana
Informe a seu DDD: abc
Erro: Por favor, insira um número válido.
Fim da execução!
