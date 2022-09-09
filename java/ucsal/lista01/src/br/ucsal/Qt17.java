package br.ucsal;

import java.util.Scanner;

public class Qt17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] numbers = new int[5];
    int maior = 0;
    int pos = 0;

    for(int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número: ");
      numbers[i] = sc.nextInt();
      if (numbers[i] > maior) {
        maior = numbers[i];
        pos = i;
      }
    }
    sc.close();

    System.out.println("O maior número é " + maior + " e está na posição " + pos);
  }
}
