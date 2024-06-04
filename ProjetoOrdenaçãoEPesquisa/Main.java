package ProjetoOrdenaçãoEPesquisa;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Programa de Ordenação e Pesquisa!");
        System.out.print("Digite o caminho para o arquivo: ");
        String path = scanner.nextLine();

        try {
            List<Integer> numbers = readNumbersFromFile(path);
            int[] array = numbers.stream().mapToInt(i -> i).toArray();

            EscolhaMetodo escolhaMetodo = new EscolhaMetodo();
            escolhaMetodo.ordenar(array, scanner);

            System.out.println("Sorted data: " + Arrays.toString(array));

            System.out.print("Digite o valor para pesquisar: ");
            int valor = scanner.nextInt();
            escolhaMetodo.pesquisar(array, valor, scanner);

        } catch (IOException e) {
            System.out.println("Falha ao ler o arquivo: " + e.getMessage());
        }
    }

    private static List<Integer> readNumbersFromFile(String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    numbers.add(Integer.parseInt(line.trim()));
                }
            }
        }
        return numbers;
    }
}