public class Main {

  public static void main(String[] args) {
    System.out.println(div(62, 99));
  }

  public static int div(int num, int div) {
    if (sub(num, div) < div) {
      return sub(num, div);
    }
    return div(sub(num, div), div);
  }

  public static int sub(int first, int second) {
    return first - second;
  }
}

/*
  Codigo aprimorado

    public static int div(int num, int div) {
      int result = sub(num, div);

      if (result >= div) {
      result = div(result, div);
      }
      return result;
    }

 */