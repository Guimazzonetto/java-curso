package screenmatch.modelos;

public class Filme {
  // Aqui iremos declarar o que todo filme possui

  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  public String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public boolean getIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public double getSomaDasAvaliacoes() {
    return somaDasAvaliacoes;
  }

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setNome(String nome) {
    /** O PRIMEIRO NOME É A REFERÊNCIA DO ATRIBUTO DA CLASSE O SEGUNDO É O QUE SERÁ
     RECEBIDO; **/
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setInclusoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void exibeFichaTecnica() {
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }

}
