import java.util.Scanner;
public class AreaTerreno {
  public static void main(String[] args) {
       double area;
       double AR;
       double AT;
       Scanner input = new Scanner(System.in);
       System.out.println("Ingrese la base del Terreno: ");
       double base = input.nextDouble();
       System.out.println("Ingrese la altura de del Terreno: ");
       double AC = input.nextDouble();
       AT = (AC/2*base/2);
       AR = (AC/2*base);
       area = (AT+AR);
       System.out.println("El Area total del Terreno: " + area);
    }
}
