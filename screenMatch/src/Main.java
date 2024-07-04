public class Main {
  public static void main(String[] args) {
    // A classe seria o tipo (int, boolean, double...)
    // meuFilme é o nome da variável
    Filme meuFilme = new Filme();
    meuFilme.nome = "O poderoso chefão";
    meuFilme.anoDeLancamento = 1970;
    meuFilme.duracaoEmMinutos = 180;

    // Chamando o método
    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);
    System.out.println(meuFilme.somaDasAvaliacoes);
    System.out.println(meuFilme.totalDeAvaliacoes);
    System.out.println("Minha média é: " + meuFilme.pegaMedia());
  }
}
