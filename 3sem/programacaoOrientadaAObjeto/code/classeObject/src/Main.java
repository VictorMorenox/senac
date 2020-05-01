public class Main {

    public static void main(String[] args) {
        
        EquacaoPolinomial ep = new EquacaoPolinomial(2.0, 2.1, 2.3);
        EquacaoPolinomial ep1 = new EquacaoPolinomial(2.0, 2.1, 2.3);
        System.out.println(ep.equals(ep1));
        System.out.println(ep.toString());
    }
}
