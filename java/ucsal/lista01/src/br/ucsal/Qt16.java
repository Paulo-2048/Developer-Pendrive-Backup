package br.ucsal;

import java.util.Scanner;

public class Qt16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] names = new String[5];
    int[] ages = new int[5];
    int sum = 0;

    for (int i = 0; i < names.length; i++) {
      System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
      names[i] = sc.nextLine();
      System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
      ages[i] = sc.nextInt();
      sc.nextLine();
      sum += ages[i];
    }
    sc.close();

    float average = (float) sum / (float) names.length;
    System.out.println("\nA média de idade das pessoas é: " + average);

    for (int i = 0; i < names.length; i++) {
      if (ages[i] > average) {
        System.out.println(names[i] + " tem mais idade acima da média. (" + ages[i] + " anos)");
      }
    }

  }
}
