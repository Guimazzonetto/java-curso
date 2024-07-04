import screenmatch.modelos.Filme;

public class Main {
  public static void main(String[] args) {
    // A classe seria o tipo (int, boolean, double...)
    // meuFilme é o nome da variável
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);

    // Chamando o método
    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(7);
    meuFilme.avalia(7);
    meuFilme.avalia(7);
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    System.out.println("Minha média é: " + meuFilme.pegaMedia());
  }
}
