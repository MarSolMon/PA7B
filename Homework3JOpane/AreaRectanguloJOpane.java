import javax.swing.JOptionPane;;
public class AreaRectanguloJOpane {
   public static void main(String[] args) {
        double area;
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo:"));
        area = b * a;
        JOptionPane.showMessageDialog(null,  "El area total del rectangulo es: " + area);
     }
}
