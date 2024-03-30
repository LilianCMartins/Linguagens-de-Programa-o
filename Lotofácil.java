package Lotofácil;     // Projeto de desenvolvimento de um sistema de loteria.

import java.io.IOException;      // Bibliotecas do Java -- biblioteca para tratar exceções.
import java.util.Random;        // Geração de números aleatórios
import java.util.Scanner;

public class Lotofácil {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;
        System.out.println("\n" + "--- LOTOFÁCIL ! ---");

        do {                                                // Menu das apostas da Loteria.
            System.out.println("*********************");    // Doo e while são estruturas de repetição.
            System.out.println("Menu LOTOFÁCIL");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("*********************");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {                    // Estrutura de repetição para a tomar decisões dentro do programa.
                case 1:
                    apostarDe0a100(scanner, random);
                    break;
                case 2:
                    apostarDeAaZ(scanner);
                    break;
                case 3:
                    apostarParOuImpar(scanner, random);
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente");
            }
        } while (opcao != 0);

        scanner.close();  // Fechar o scanner que foi aberto.
    }
    public static void apostarDe0a100(Scanner scanner, Random random) {
        System.out.println("Apostando de 0 a 100...");
        System.out.print("Digite um número (de 0 a 100): ");
        int aposta = scanner.nextInt();

        if (aposta < 0 || aposta>100){   // If e eestrutura condicional que permite verificar algo.
            System.out.println("Aposta inválida.");
            return;
        }
        int numeroSorteado = random.nextInt(101);
        System.out.println("Número sorteado: " + numeroSorteado);
        if(aposta==numeroSorteado){
            System.out.println("Parabéns! Você ganhou R$1.000,00 reais!");
        } else {
            System.out.println("Que pena! O número sorteado foi: " +numeroSorteado);
        }
    }

    public static void apostarDeAaZ(Scanner scanner) throws IOException {
        System.out.println("Apostando de A à Z...");
        System.out.print("Digite uma letra (A à Z): ");

        char opcao = (char) System.in.read();
        char aposta = Character.toUpperCase(scanner.next().charAt(0)); // Converte a entrada do usuário para maiúsculo.

        if (!Character.isLetter(aposta) || aposta < 'A' || aposta > 'Z') {
            System.out.println("Aposta inválida.");
            return;
        }
        char letraPremiada = 'J';
        System.out.println("Letra premiada: " + letraPremiada);

        if (aposta == letraPremiada) {
            System.out.println("Você ganhou R$ 500,00 reais");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
        }
    }

    public static void apostarParOuImpar(Scanner scanner, Random random){
    System.out.println("Aposta em par ou ímpar");
    System.out.print("Digite um número inteiro ");
    int aposta = scanner.nextInt();

    if(aposta % 2 ==0){  // If e else são estruturas condicionais, que faz o teste pra saber se o número é ímpar ou par.
        System.out.println("Você ganhou R$ 100,00 reais.");
    } else {
        System.out.println ("Que pena! O número digitado é ímpar e a premiação foi para números pares! ");
    }
    }
}


