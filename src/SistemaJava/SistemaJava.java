package SistemaJava;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemaJava {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            int numeroSecreto = random.nextInt(100) + 1;
            int palpite = 0;
            int tentativas = 0;

            System.out.println("--- Jogo de Adivinhacao ---");
            System.out.println("Tente adivinhar o numero entre 1 e 100.");

            while (palpite != numeroSecreto) {
                System.out.print("\nDigite seu palpite: ");
                
                try {
                    palpite = scanner.nextInt();
                    tentativas++;

                    if (palpite > numeroSecreto) {
                        System.out.println("O numero secreto e MENOR.");
                    } else if (palpite < numeroSecreto) {
                        System.out.println("O numero secreto e MAIOR.");
                    } else {
                        System.out.println("Parabens! Voce acertou em " + tentativas + " tentativas!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Por favor, digite apenas numeros inteiros.");
                    scanner.next(); // Limpa o buffer
                }
            }
        } 
    }
}