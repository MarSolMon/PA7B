import java.util.Scanner;
public class SueldoTrabajador {
  public static void main(String[] args) {
    double SS;
    Scanner input = new Scanner(System.in);
    System.out.println("Inserte las horas trabajadas: ");
    double HT = input.nextDouble();
    System.out.println("Inserte el pago por hora: ");
    double PH = input.nextDouble();
    SS = HT * PH;
    System.out.println("Salario semanal es: " + SS);
  }
}
