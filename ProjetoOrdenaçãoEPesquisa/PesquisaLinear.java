package ProjetoOrdenaçãoEPesquisa;

public class PesquisaLinear extends MetodoPesquisa {
    @Override
    public int pesquisar(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice onde o valor foi encontrado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}
