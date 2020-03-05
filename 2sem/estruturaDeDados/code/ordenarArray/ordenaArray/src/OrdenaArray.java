public class OrdenaArray {
  // static serve para definir uma constante da classe, sem o static ele é considerado um atributo
  static final int tamanhoArray = 100000;
  static int[] ar = new int[tamanhoArray];

  public static void main(String[] args) {
    Metodos.populaArray(ar);
    Metodos.ordenaArray(ar);
    Metodos.printaArray(ar);
  }
}