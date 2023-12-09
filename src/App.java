import java.util.Scanner;

public class App {

  public static void main(String args[]) {
    Midia[] lista = new Midia[10];

    int opcao;

    for (int i = 0; i < 2; i++) {
      System.out.printf("Digite [1] para CD | [2] para DVD:\n\n");
      Scanner in = new Scanner(System.in);
      opcao = in.nextInt();
      if (
        1 == opcao
      ) lista[i] = new Cd(); else lista[i] = new Dvd();
      lista[i].inserirDados();
    }

    for (int i = 0; i < 2; i++) lista[i].printDados();
  }
}
