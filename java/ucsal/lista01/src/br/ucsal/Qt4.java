package br.ucsal;

import java.util.Scanner;

public class Qt4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira as horas de início:");
    int horasInicio = sc.nextInt();
    System.out.println("Insira os minutos de início:");
    int minutosInicio = sc.nextInt();
    System.out.println("Insira os segundos de início:");
    int segundosInicio = sc.nextInt();
    
    System.out.println("Insira as horas de fim:");
    int horasFim = sc.nextInt();
    System.out.println("Insira os minutos de fim:");
    int minutosFim = sc.nextInt();
    System.out.println("Insira os segundos de fim:");
    int segundosFim = sc.nextInt();
    sc.close();

    int totalSegundosInicio = (horasInicio * 3600) + (minutosInicio * 60) + segundosInicio;
    int totalSegundosFim = (horasFim * 3600) + (minutosFim * 60) + segundosFim;
    int totalSegundos = totalSegundosFim - totalSegundosInicio;

    int horas = totalSegundos / 3600;
    int minutos = (totalSegundos % 3600) / 60;
    int segundos = (totalSegundos % 3600) % 60;

    System.out.printf("O total de tempo de duração é: %s:%s:%s", horas, minutos, segundos);
  }
}
