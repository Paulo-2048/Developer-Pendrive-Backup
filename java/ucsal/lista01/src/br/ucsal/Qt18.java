package br.ucsal;

public class Qt18 {
  public static void main(String[] args) {
    int[][] matrix = {
      {0, 1, 0, 0},
      {0, 0, 1, 0},
      {0, 0, 0, 1},
      {1, 0, 0, 0}
    };

    for (int i = 0; i < matrix.length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
      }
      
      if (sum != 1) {
        System.out.println("A matriz não é de permutação.");
        return;
      }
    }
    
    System.out.println("A matriz é de permutação.");
  }
}
