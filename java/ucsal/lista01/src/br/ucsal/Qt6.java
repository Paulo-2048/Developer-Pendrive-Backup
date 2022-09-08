package br.ucsal;

import java.util.Scanner;

public class Qt6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira a quantidade de maçãs:");
    int qtMacas = sc.nextInt();

    sc.close();
    if (qtMacas < 12) {
      System.out.println("O valor total da compra é: R$ " + (qtMacas * 0.30));
    } else {
      System.out.println("O valor total da compra é: R$ " + (qtMacas * 0.25));
    }
  }
}
