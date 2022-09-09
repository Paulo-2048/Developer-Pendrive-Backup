package br.ucsal;

import java.util.Scanner;

public class Qt15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma palavra: ");
    String word = sc.nextLine();
    sc.close();

    String[] letters = word.split("");

    for (int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }
  }
}
