package br.ucsal;

import java.util.Scanner;

public class Qt12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int qt = 0;
    int bigNumber = 0;
    int smallNumber = 0;
    int parQt = 0;
    int parSum = 0;

    boolean flag = true;
    boolean init = true;

    do {
      System.out.println("Insira um número positivo: ");
      int number = sc.nextInt();
      if (init) {
        bigNumber = number;
        smallNumber = number;
        init = false;
      }
      
      if (number <= 0) {
        flag = false;
        break;
      } else if (number < smallNumber) {
        smallNumber = number;
      }

      if (number > bigNumber) {
        bigNumber = number;
      }

      if (number % 2 == 0 && number != 0) {
        parQt++;
        parSum += number;
      }

      sum += number;
      qt++;
    } while (flag);
    sc.close();
    
    System.out.println("Soma: " + sum);
    System.out.println("Quantidade: " + qt);
    System.out.println("Média: " + (float) ((float) sum / (float) qt));
    System.out.println("Maior número: " + bigNumber);
    System.out.println("Menor número: " + smallNumber);
    System.out.println("Média de números pares: " + (float) ((float) parSum / (float) parQt));

  }
}
