public class Metodos {
  /**
   * Insere valores aleatorios no array
   *
   * @param array
   */
  public static void populaArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 101);
    }
  }

  public static void printaArray(int[] array) {
    for (int obj :
      array) {
      System.out.println(obj);
    }
  }

  /**
   * Ordena array pelo metodo de selecao
   *
   * @param array
   */
  public static void ordenaArray(int[] array) {
    int min;
    int aux;
    // Quantidade de varreduras do array
    for (int i = 0; i < array.length - 1; i++) {
      min = i;
      // Quantidade de comparações
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      aux = array[min];
      array[min] = array[i];
      array[i] = aux;
    }
  }
}
