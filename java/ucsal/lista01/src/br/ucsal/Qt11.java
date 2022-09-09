package br.ucsal;

import java.util.Scanner;

public class Qt11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Insira uma operação: ");
    System.out.println("1 - Depósito\n2 - Retirada\n3 - Fim");
    int operacao = sc.nextInt();

    float saldo = 0;
    while (operacao != 3) {
      switch (operacao) {
        case 1:
          System.out.println("Insira o valor do depósito: ");
          float deposito = sc.nextFloat();
          saldo += deposito;
          break;

        case 2:
          System.out.println("Insira o valor do saque: ");
          float saque = sc.nextFloat();
          saldo -= saque;

          break;
        default:
          System.out.println("Operação inválida");
          break;
      }
      System.out.println("Saldo: " + saldo);
      System.out.println("Insira uma operação: ");
      System.out.println("1 - Depósito\n2 - Retirada\n3 - Fim");
      operacao = sc.nextInt();
    }
    sc.close();

    if (saldo == 0) {
      System.out.printf("%s, Conta zerada!", nome);
    } else if (saldo < 0) {
      System.out.printf("%s, Conta estourada!", nome);
    } else {
      System.out.printf("%s, Conta Preferencial!", nome);
    }
  }
}
