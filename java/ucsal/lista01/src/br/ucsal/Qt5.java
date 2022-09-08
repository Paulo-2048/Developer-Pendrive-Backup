package br.ucsal;

import java.util.Scanner;

public class Qt5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Insira a idade:");
    int idade = sc.nextInt();
    sc.close();

    if (idade < 16) {
      System.out.println("Não vota");

    } else if (idade >= 16 && idade < 18 || idade > 65) {
      System.out.println("Voto opcional");

    } else if (idade >= 18 && idade <= 65) {
      System.out.println("Voto obrigatório");
    }
  }
}
