package br.ucsal;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    matrixOperations matrix = new matrixOperations();
    int[][] result = matrix.fillMatrixRandom(10, 10);

    matrix.showMatrix(result);
    System.out.println("\n+++++++++++++++++++++++++++++++++\n");
    int occurrences = matrix.countOccurrence(result, 3);
    System.out.println("O número " + 3 + " aparece " + occurrences + " vezes na matriz");
  }
}
