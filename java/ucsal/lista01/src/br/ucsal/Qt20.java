package br.ucsal;

public class Qt20 {
  public static void main(String[] args) {
    int[][] matrix = new int[3][3];

    int count = 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[j][i] = count;
        count++;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
