  public class Main {

    public static void main(String[] args) {
      System.out.println(fibonacciRecursivo(2));
    }

    public static int fibonacciRecursivo(int num) {
      if (num == 1 || num == 2) {
        return 1;
      } else {
        return fibonacciRecursivo( num - 1) + fibonacciRecursivo(num - 2);
      }
    }
  }

