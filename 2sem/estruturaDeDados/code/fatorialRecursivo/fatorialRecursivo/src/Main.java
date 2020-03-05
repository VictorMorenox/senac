public class Main {

  public static void main(String[] args) {
    System.out.println(fatR(20));
  }

  public static int fatR(int n) {
    if (n <= 1) {
      return 1;
    } else {
          return n * fatR(n - 1);
    }
  }
}
