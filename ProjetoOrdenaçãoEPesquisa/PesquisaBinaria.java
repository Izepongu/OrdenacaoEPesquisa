package ProjetoOrdenaçãoEPesquisa;

class PesquisaBinaria extends MetodoPesquisa {
    @Override
    public int pesquisar(int[] array, int valor) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            // Verifica se o valor está presente no meio do array
            if (array[meio] == valor) {
                return meio;
            }

            // Se o valor for maior, ignora a metade direita do array
            if (array[meio] < valor) {
                esquerda = meio + 1;
            }
            // Se o valor for menor, ignora a metade esquerda do array
            else {
                direita = meio - 1;
            }
        }

        // Retorna -1 se o valor não estiver presente no array
        return -1;

    }
}