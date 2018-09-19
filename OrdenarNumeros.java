import java.util.Scanner;
public class OrdenarNumeros{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A, B, C, M;
    System.out.println("Ingrese el primer numero");
    A = input.nextInt();
    System.out.println("Ingrese el segundo numero");
    B = input.nextInt();
    System.out.println("Ingrese el tercer numero");
    C = input.nextInt();
    if (A > B) {
      if (A > C) {
        M = A;
      }else{
        M = C;
      }
    }else{
      if (B > C) {
        M = B;
      }else{
        M = C;
      }
    }
    System.out.println("El numero mayor es: " + M);
  }
}
