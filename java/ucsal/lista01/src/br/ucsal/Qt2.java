package br.ucsal;

import java.util.Scanner;

public class Qt2 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira as horas:");
    int horas = sc.nextInt();
    System.out.println("Insira os minutos:");
    int minutos = sc.nextInt();
    System.out.println("Insira os segundos:");
    int segundos = sc.nextInt();

    int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
    System.out.println("O total de segundos é: " + totalSegundos);
    sc.close();
  }
}
