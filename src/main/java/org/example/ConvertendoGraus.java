package org.example;

import java.util.Scanner;

public class ConvertendoGraus {
    public static void main(String[] args) {
        double temp;
        int grausFahrenheit;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        temp = ler.nextDouble();

        grausFahrenheit = (int) (temp * 1.8) + 32; // o (int) converte o meu temp. De double para int

        System.out.print("De acordo com a temperatura informada em graus " +
                "Celsius, essa é a temperatura em graus Fahrenheit: " + grausFahrenheit);
    }
}