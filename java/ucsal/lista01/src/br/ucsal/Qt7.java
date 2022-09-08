package br.ucsal;

import java.util.Scanner;

public class Qt7 {
  public static void main(String[] args) {
    // Faça um programa em Java que receba três valores inteiros referentes ao
    // tamanho dos três lados de um triângulo. Para formar um triângulo cada lado
    // deve ser menor do que a soma dos outros dois lados. Uma vez verificado que os
    // valores estão corretos (ou seja, formam um triângulo) o programa deve
    // classifica-lo em equilátero (todos os lados iguais), isósceles (dois lados
    // iguais), escaleno (todos os lados diferentes)

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o primeiro lado:");
    int lado1 = sc.nextInt();
    System.out.println("Insira o segundo lado:");
    int lado2 = sc.nextInt();
    System.out.println("Insira o terceiro lado:");
    int lado3 = sc.nextInt();
    sc.close();
    
  }
}
