import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Passo1:Mostrar variaveis
    double metrosquadrados;
    double latasdetinta;
    double valor;
    // Passo2:Entrada de dados
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos metros quadrados serão pintados :");
    metrosquadrados = teclado.nextDouble();
    // Passo3:Mostrar quantidades
    latasdetinta = Math.ceil (metrosquadrados / 54d);
    valor = latasdetinta * 80;
    // Passo4:Mostrar resultado
    System.out.println("Serão necessárias :" + latasdetinta);
    System.out.println("Valor das latas $:" + valor);
  }
}