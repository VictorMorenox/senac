
public class Main {

    public static void main(String[] args) {
        System.out.println(retornaNumeroFatorial(2));
    }

    public static int retornaNumeroFatorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + retornaNumeroFatorial(n - 1);
        }
    }
}
