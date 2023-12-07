import java.util.Scanner;

public class Dvd extends Midia {
    private int nFaixas;

    // Construtor sem parâmetros.
    public Dvd() {
        this(0, 0.0, "Nenhum", 0);
    }
    // Construtor com parâmetros.

    public Dvd(int codigo, double preco, String name, int nFaixas) {
        super(codigo, preco, name);
        setFaixas(nFaixas);
    }

    // Função para impressao do tipo.
    public String getTipo() {
        return "Dvd: ";
    }

    // Função que retorna o conteúdo do campos desta
    // classe e da classe Midia (usando super !).
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Numero de faixas: " + nFaixas + "\n";
    }

    public void setFaixas(int nfaix) {
        nFaixas = (nfaix > 0) ? nfaix : 0;
    }

    // Função para leitura dos dados via teclado dos
    // campos desta classe e dos campos da classe
    // Midia (usando super !).
    public void inserirDados() {
        // Leitura dos dados contidos nos campos
        // pertencentes a classe Midia.
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        // Leitura dos dados do teclado.
        System.out.printf("\n Entre com o numero de faixas: ");
        int nfaix = in.nextInt();
        // Enviando os dados lidos para as funcoes set.
        setFaixas(nfaix);
    }
}