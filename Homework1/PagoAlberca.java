import java.util.Scanner;
public class PagoAlberca {
  public static void main(String[] args) {
    double V;
    double PAG;
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la altura de la alberca: ");
    double A = input.nextDouble();
    System.out.println("Ingrese el largo de la alberca: ");
    double L = input.nextDouble();
    System.out.println("Ingrese el ancho de la alberca: ");
    double N = input.nextDouble();
    V = (A * L * N);
    System.out.println("Costo en metros: ");
    double CM = input.nextDouble();
    PAG = V * CM;
    System.out.println("Pago a realizar es: " + PAG);
  }
}
