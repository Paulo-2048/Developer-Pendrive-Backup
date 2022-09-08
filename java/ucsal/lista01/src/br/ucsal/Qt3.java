package br.ucsal;

import java.util.Scanner;

public class Qt3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o peso da 1º nota:");
    float peso1 = sc.nextFloat();
    System.out.println("Inira o valor da 1º nota:");
    float nota1 = sc.nextFloat();

    System.out.println("Insira o peso da 2º nota:");
    float peso2 = sc.nextFloat();
    System.out.println("Inira o valor da 2º nota:");
    float nota2 = sc.nextFloat();

    System.out.println("Insira o peso da 3º nota:");
    float peso3 = sc.nextFloat();
    System.out.println("Inira o valor da 3º nota:");
    float nota3 = sc.nextFloat();

    sc.close();

    float mediaFinal = calcularMediaPonderada(peso1, nota1, peso2, nota2, peso3, nota3);

    System.out.println("Sua média ponderada é: " + mediaFinal);
  }

  private static float calcularMediaPonderada(float peso1, float nota1, float peso2, float nota2, float peso3, float nota3) {

    float media = ((peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3)) / (peso1 + peso2 + peso3);
    return media;
  }
}
