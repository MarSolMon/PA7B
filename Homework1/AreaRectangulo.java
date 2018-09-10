import java.util.Scanner;
public class AreaRectangulo {
   public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo" );
        double b=input.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double a=input.nextDouble();
        area = b * a;
        System.out.println("El área del rectangulo es: " + area);
     }
}
