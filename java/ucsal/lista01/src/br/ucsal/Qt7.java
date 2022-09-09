package br.ucsal;

import java.util.Scanner;

public class Qt7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o primeiro lado:");
    int lado1 = sc.nextInt();

    System.out.println("Insira o segundo lado:");
    int lado2 = sc.nextInt();

    System.out.println("Insira o terceiro lado:");
    int lado3 = sc.nextInt();
    sc.close();

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
      if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("É um triângulo equilátero");

      } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
        System.out.println("É um triângulo isósceles");

      } else {
        System.out.println("É um triângulo escaleno");
      }
      
    } else {
      System.out.println("Não é um triângulo");
    }
    
  }
}
