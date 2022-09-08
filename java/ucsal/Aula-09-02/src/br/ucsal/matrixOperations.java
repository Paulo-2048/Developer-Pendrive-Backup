package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class matrixOperations {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public int[][] fillMatrix(int row, int columns) {
    int[][] result = new int[row][columns];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1));
        result[i][j] = sc.nextInt();
      }
    }
    sc.close();
    return result;
  }

  public int[][] fillMatrixRandom(int row, int columns) {
    int[][] result = new int[row][columns];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = random.nextInt(10);
      }
    }
    sc.close();
    return result;
  }

  public void showMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void showDiagonalMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (i == j) {
          System.out.print(ANSI_YELLOW + matrix[i][j] + " " + ANSI_RESET);
        } else {
          System.out.print("- ");
        }
      }
      System.out.println();
    }
  }

  public int countOccurrence(int[][] result, int i) {
    int count = 0;
    for (int j = 0; j < result.length; j++) {
      for (int k = 0; k < result[j].length; k++) {
        if (result[j][k] == i) {
          count++;
        }
      }
    }
    return count;
  }

}
