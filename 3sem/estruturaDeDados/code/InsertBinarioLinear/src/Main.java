public class Main {

  public static void main(String[] args) {
    float[] array = new float[10];
    populaArray(array);
    printaArray(array);
    ordenaArray(array);
    System.out.println();
    printaArray(array);
    System.out.println("Pesquisa binario");
    System.out.println(pesquisaBinario(array, array[5], 0, array.length - 1));
    System.out.println("Pesquisa linear");
    System.out.println(pesquisaLinear(array, -2, 0));
  }

  public static void populaArray(float[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (float) (Math.random() * 50);
    }
  }

  public static void printaArray(float[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void ordenaArray(float[] array) {
    for (int i = 0; i < array.length; i++) {
      int index = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[index]) {
          index = j;
        }
      }
      float smallerNumber = array[index];
      array[index] = array[i];
      array[i] = smallerNumber;
    }
  }

  public static int pesquisaBinario(float[] array, float valor, int inicio, int fim) {
    int centro = (fim + inicio) / 2;
    if (valor == array[centro]) {
      return centro;
    } else if (fim < inicio) {
      return -1;
    } else if (valor > array[centro]) {
      return pesquisaBinario(array, valor, centro + 1, fim);
    } else {
      return pesquisaBinario(array, valor, inicio, centro - 1);
    }
  }

  public static int pesquisaLinear(float[] array, float valor, int inicio) {
    if (inicio >= array.length) {
      return -1;
    }
    if (array[inicio] == valor) {
      return inicio;
    } else {
      return pesquisaLinear(array, valor, inicio + 1);
    }
  }
}
