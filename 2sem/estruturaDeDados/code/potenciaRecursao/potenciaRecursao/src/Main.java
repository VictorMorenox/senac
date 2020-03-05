public class Main {

  public static void main(String[] args) {
    System.out.println(pot(2, 4));
  }

  public static double pot(int num, int potencia) {
    if (potencia == 1) {
      return num;
    } else {
      return num * pot(num, potencia - 1);
    }
  }
}