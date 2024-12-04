public class Main {
   public static void main(String[] args) {

       Filme film = new Filme();
       film.nomeDoFilme = "Os Pinguins de Madagascar";
       film.anoDeLancamento = 2014;
       film.duracaoEmMinutos = 92;
       film.sinopse = """
               Os valentes pinguins Capitão, Kowalski, Rico e Recruta se unem 
               a uma força de elite, chamada Vento do Norte, para impedir que 
               o vilão Dr. Octavius Brine acabe com os pinguins do mundo todo.
               """;
       film.exibeDadosDoFilme();
   }

}
