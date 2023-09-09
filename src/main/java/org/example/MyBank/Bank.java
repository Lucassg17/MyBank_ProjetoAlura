package org.example.MyBank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int opcao = 0;
        double saldoAtual = 0;
        double valorTranferencia = 0;
        double valorDeposito = 0;

        Scanner lerOpc = new Scanner(System.in);

        DadosUsuario dadosUsuario = new DadosUsuario();

        dadosUsuario.setNome("Lucas da Silva Gomes");
        dadosUsuario.setTipoConta("Corrente");
        dadosUsuario.setSaldoInicial(2500.00);

        System.out.println("***********************");
        System.out.println("\nOlá, " + dadosUsuario.getNome());
        System.out.println("Tipo de Conta: " + dadosUsuario.getTipoConta());
        System.out.println("Seu Saldo Inicial é: R$ " + dadosUsuario.getSaldoInicial());
        System.out.println("\n***********************");

        while (opcao != 4){
            System.out.println("\nOperações:");
            System.out.println("1 - Consultar Saldo Atual");
            System.out.println("2 - Realizar transferência");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = lerOpc.nextInt();

            switch (opcao){
                case 1:
                    saldoAtual = dadosUsuario.getSaldoInicial() - valorTranferencia + valorDeposito;
                    System.out.println("\nSaldo Atual: " + saldoAtual);
                    break;
                case 2:
                    System.out.println("\nDigite o valor desejado: ");
                    valorTranferencia = lerOpc.nextDouble();
                    if (valorTranferencia > saldoAtual){
                        System.out.println("Saldo insuficiente. Digite um novo valor: ");
                        valorTranferencia = lerOpc.nextDouble();
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o valor do depósito: ");
                    valorDeposito = lerOpc.nextDouble();
                    break;
                default:
                    if (opcao == 4){
                        System.out.println("\nAté logo!");
                    } else {
                        System.out.println("\nDesculpe, não entendi. Digite a opção desejada: ");
                    }
                    break;
            }
        }
    }
}
