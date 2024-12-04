public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double notaDoFilme;
    int avaliacao;
    int totalDeAvaliacoes;
    String sinopse;
    int duracaoEmMinutos;

    void exibeDadosDoFilme() {
        System.out.println("NomeDoFilme: " + this.nomeDoFilme);
        System.out.println("AnoDeLancamento: " + this.anoDeLancamento);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Duracão: " + this.duracaoEmMinutos + " minutos");
    }
}