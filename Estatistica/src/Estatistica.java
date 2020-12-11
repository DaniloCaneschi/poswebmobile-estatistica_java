import java.util.Arrays;

public class Estatistica {

  public static void main(String[] args){

    final double[] valores = {1, 2, 4, 67, 7, 8, 9, 10};

    System.out.println("Somatório: " + somar(valores));
    System.out.println("Média: " + media(valores));
    System.out.println("Variância: " + variancia(valores));
    System.out.println("Desvio Padrão: " + desvioPadrao(valores));
  }

  static double somar(double valores[]){
    return Arrays.stream(valores).map(v -> v).sum();
  }

  static double media(double valores[]){
    return somar(valores) / (double) valores.length;
  }

  static double variancia(double valores[]){
    double media = media(valores);

    double quadDiferenca = 0;

    for (double valor : valores) {
      quadDiferenca += Math.pow(valor - media, 2);
    }

    return quadDiferenca / valores.length;
  }

  static double desvioPadrao(double valores[]){
    return Math.sqrt(variancia(valores));
  }
}