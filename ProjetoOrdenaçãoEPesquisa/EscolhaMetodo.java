package ProjetoOrdenaçãoEPesquisa;

import java.util.Scanner;

public class EscolhaMetodo {
    public void ordenar(int[] array, Scanner scanner) {
        System.out.println("Escolha o método de classificação:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Quick Sort");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                InsertionSort.sort(array);
                break;
            case 2:
                BubbleSort.sort(array);
                break;
            case 3:
                QuickSort.sort(array);
                break;
            default:
                System.out.println("Escolha inválida");
                InsertionSort.sort(array);
                break;
        }
    }

    public int pesquisar(int[] array, int valor, Scanner scanner) {

        // Interface com o usuário para escolher o método de pesquisa
        System.out.println("Escolha o método de pesquisa:");
        System.out.println("1. Pesquisa Linear");
        System.out.println("2. Pesquisa Binária");

        int escolha = scanner.nextInt();
        MetodoPesquisa metodoPesquisa;

        if (escolha == 1) {
            metodoPesquisa = new PesquisaLinear();
        } else if (escolha == 2) {
            metodoPesquisa = new PesquisaBinaria();
        } else {
            System.out.println("Escolha inválida. Utilizando pesquisa linear por padrão.");
            metodoPesquisa = new PesquisaLinear();
        }

        scanner.close();

        return metodoPesquisa.pesquisar(array, valor);
    }
}
