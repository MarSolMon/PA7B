import java.util.Scanner;
public class AreaCono {
   public static void main(String[] args) {
        double SQRT;
        double C;
        double AT;
        double area;
        double AC;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la hipotenusa: ");
        double H = input.nextDouble();
        System.out.println("Ingrese el radio: ");
        double R = input.nextDouble();
        C = (H*2-R*2);
        SQRT = (float)Math.sqrt(C);
        AT = 2 * (R * SQRT)/2;
        AC = (3.1416 * R * 2) / 2;
        area = AT + AC;
        System.out.println("El total es: " + area);
     }
}

//ejecuta de nuevo haber si te da un error
