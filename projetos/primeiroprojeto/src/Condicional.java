public class Condicional {
  public static void main(String[] args) {
    int anoDeLancamento = 2022;
    boolean inclusoNoPlano = false;
    double notaDoFilme = 8.1;
    String tipoPlano = "plus";

    if (anoDeLancamento >= 2022){
      System.out.println("Lançamento Recente!");
    } else {
      System.out.println("Filme anterior a 2022.");
    }

    if (inclusoNoPlano && tipoPlano.equals("plus")) {
      System.out.println("Filme liberado.");
    } else {
      System.out.println("Deve pagar a locação.");
    }
  }
}
