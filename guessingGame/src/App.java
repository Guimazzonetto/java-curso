import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
    int value = new Random().nextInt(100);
    System.out.println("Valor gerado: " + value);
    int numeroTentativa = 1;
    int numeroDigitado = 0;

    System.out.println(
        "Foi gerado um valor aleatório entre 0 e 100, você deve adivinhar qual o valor em até 5 tentativas! Será que consegue?");

    while (numeroTentativa <= 5) {
      System.out.println(String.format("Digite a sua tentativa de número %d: ", numeroTentativa));
      numeroDigitado = leitor.nextInt();
      System.out.println("O número digitado foi: " + numeroDigitado);
      numeroTentativa++;

      if (numeroDigitado == value) {
        System.out.println("Parabéns você acertou o número!!");
        break;
      } else if (numeroDigitado > value) {
        System.out.println("O número é menor do que a sua tentativa");
      } else {
        System.out.println("O número é maior do que a sua tentativa");
      }
    }

    if (numeroTentativa == 6 && numeroDigitado != value) {
      System.out.println("Você não conseguiu acertar o número! Que pena");
    }

  }
}
