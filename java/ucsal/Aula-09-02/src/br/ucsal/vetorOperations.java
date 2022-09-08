package br.ucsal;

public class vetorOperations {
  public int[] sumVetor(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i] + arr2[i];
    }
    return result;
}
}
