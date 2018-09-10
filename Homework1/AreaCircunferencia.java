import java.util.Scanner;
public class AreaCircunferencia {
   public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        double R = input.nextDouble();
        area = (3.1416 * R * 2);
        System.out.println("El área del rectangulo es: " + area);
     }
}
