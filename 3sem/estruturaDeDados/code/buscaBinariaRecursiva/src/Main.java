public class Main {
  public static void main(String[] args) {
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = i * 2;
    }

    System.out.println(binRec(array, 10, 0, array.length - 1));

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static int binRec(int[] array, int valor, int inicio, int fim) {
    int central;
    if (fim >= inicio) {
      central = (fim + inicio) / 2;
      if (array[central] == valor) {
        return central;
      } else if (valor > array[central]) {
        return binRec(array, valor, central + 1, fim);
      } else {
        return binRec(array, valor, inicio, central - 1);
      }
    }
    return -1;
  }
}