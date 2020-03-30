import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int TAMANHO_ARRAY = 5;
    static float[] array = new float[TAMANHO_ARRAY];

    public static void main(String[] args) {

        preencheArray(array);
        printaArray(array);
        ordenaArray(array, 0, TAMANHO_ARRAY - 1);
        System.out.println("\n\n");
        printaArray(array);
        System.out.println();
        Float chave = pergunteF("Qual o numero que deseja encontrar?");
        int indice = buscaBinaria(array, chave, 0, TAMANHO_ARRAY - 1);
        if (indice == -1) {
            System.out.println("Nao encontrado");
        } else {
            System.out.println("Encontrou no indice " + indice);
        }
        System.out.println("");
        chave = pergunteF("Qual numero deseja excluir do array?");
        deletaElemento(array, chave);
        printaArray(array);
    }

    static public void deletaElemento(float array[], float chave) {
        int indiceEncontrado;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == chave) {
                indiceEncontrado = i;
            }

            for (indiceEncontrado = i; indiceEncontrado < array.length; indiceEncontrado++) {
                if (indiceEncontrado == array.length - 1) {
                    array[array.length - 1] = 0.0f;
                    return;
                }
                array[indiceEncontrado] = array[indiceEncontrado + 1];
            }
        }
    }

    static public void ordenaArray(float array[], int comeco, int fim) {
        if (comeco < fim) {
            int indiceParticao = particao(array, comeco, fim);

            ordenaArray(array, comeco, indiceParticao - 1);
            ordenaArray(array, indiceParticao + 1, fim);
        }
    }

    static public int particao(float array[], int comeco, int fim) {
        float pivot = array[fim];
        int i = (comeco - 1);

        for (int j = comeco; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;

                float temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        float temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    static public void preencheArray(float[] array) {
        float number, formatedNumber;
        for (int i = 0; i < array.length; i++) {
            number = (float) (Math.random() * 200) + 1;
            formatedNumber = (float) (Math.round(number * 100.0) / 100.0);
            array[i] = formatedNumber;
        }
    }

    static public void printaArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static int buscaBinaria(float[] array, float valor, int comeco, int fim) {
        if (comeco > fim)
            return -1;

        int m = (comeco + fim) / 2;
        if (array[m] < valor) {
            return  buscaBinaria(array,valor,m+1,fim);
        }
        if (array[m] > valor) {
            return  buscaBinaria(array,valor,comeco,m-1);
        }
        return m;
    }

    static public float pergunteF(String pergunta) {
        System.out.println(pergunta);
        return sc.nextFloat();
    }
}
