package br.ucsal;

import java.util.Scanner;

public class Qt10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número: ");
    int num = sc.nextInt();
    sc.close();

    int a = 0;
    int b = 1;
    int flagCount = 0;

    while (flagCount < num) {
      flagCount = a + b;
      a = b;
      b = flagCount;
    }

    if (flagCount == num) {
      System.out.println("É um termo da sequência de Fibonacci");

    } else {
      System.out.println("Não é um termo da sequência de Fibonacci");

    }
  }
}
