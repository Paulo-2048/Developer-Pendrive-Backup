package br.ucsal;

import java.util.Scanner;

public class Qt8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira número do enquadramento: ");
    int enq = sc.nextInt();

    System.out.println("Insira as horas trabalhadas: ");
    int horas = sc.nextInt();
    sc.close();

    float salario = 0;
    switch (enq) {
      case 1:
        salario = horas * 12;
        break;
      case 2:
        salario = horas * 17;
        break;
      case 3:
        salario = horas * 25;
        break;
      case 4:
        salario = horas * 2;
        break;
      default:
        System.out.println("Enquadramento inválido");
        break;
    }
    
    System.out.println("Salário: " + salario);
  }
  
}
