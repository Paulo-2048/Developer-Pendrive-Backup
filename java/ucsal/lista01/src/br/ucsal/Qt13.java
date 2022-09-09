package br.ucsal;

import java.util.Scanner;

public class Qt13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um número inteiro: ");
    int number = sc.nextInt();
    sc.close();

    int flag = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        flag++;
      }
    }

    if (flag == 2) {
      System.out.println("O número " + number + " é primo.");
    } else {
      System.out.println("O número " + number + " não é primo.");
    }
    
  }
}
