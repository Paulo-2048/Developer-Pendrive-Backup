package br.ucsal;

import java.util.Scanner;

public class Qt14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de números primos: ");
    int qt = sc.nextInt();
    sc.close();

    int primos = 1;

      for (int i = 1; qt >= primos; i++) {
        int flag = 0;
        for (int j = 1; j <= i; j++) {
          if (i % j == 0) {
            flag++;
          }
        }
        
        if (flag == 2) {
          System.out.println(i);
          primos++;
        }
    }

  }
}
