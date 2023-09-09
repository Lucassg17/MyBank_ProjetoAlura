package org.example;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int tentativas = 0;
        int numDigitado;
        int numSorteado;

        Random numAleatorio = new Random();
        Scanner lerNum = new Scanner(System.in);

        numSorteado = numAleatorio.nextInt(11);
        System.out.println("Um número aleatório de 0 a 5 foi gerado" + "\n");

        while (tentativas < 5){
            System.out.print("Tente descobrir qual é o número, digitando aqui seu palpite: ");
            numDigitado = lerNum.nextInt();
            tentativas++;

            if (numSorteado == numDigitado){
                System.out.println("Parabéns!! Você acertou!!");
                break;
            }
        }
    }
}
