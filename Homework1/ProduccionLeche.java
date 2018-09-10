import java.util.Scanner;
public class ProduccionLeche {
  public static void main(String[] args) {
    double GA;
    double TG;
    Scanner input = new Scanner(System.in);
    System.out.println("Litros a entregar: ");
    int L = input.nextInt();
    System.out.println("Precio del galon: ");
    double PG = input.nextDouble();
    TG = (L / 3.785);
    System.out.println("Cantidad de galones: " + TG);
    GA = PG * TG;
    System.out.println("Ganancia obtenida es: " + GA);
  }
}
