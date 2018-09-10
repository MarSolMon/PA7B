import java.util.Scanner;
public class TelaPulgadas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Cantidad de metros requerida: ");
    double CM = input.nextDouble();
    System.out.println("Pulgadas a pedir: ");
    double PG = input.nextDouble();
    PG = CM/2.54;
    System.out.println("La cantidad de pulgadas es: " + PG);
  }
}
