import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;


public class Main {
  public static void main(String[] args) {
    // A classe seria o tipo (int, boolean, double...)
    // meuFilme é o nome da variável
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

    // Chamando o método
    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(7);
    meuFilme.avalia(7);
    meuFilme.avalia(7);
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    System.out.println("Minha média é: " + meuFilme.pegaMedia());

    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    Filme segundoFilme = new Filme();
    segundoFilme.setNome("Avatar");
    segundoFilme.setAnoDeLancamento(2023);
    segundoFilme.setDuracaoEmMinutos(200);
    System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(segundoFilme);
    calculadora.inclui(lost);
    System.out.println(calculadora.getTempoTotal());

  }

}
