import javax.swing.JOptionPane;
public class AreaConoJOpane {
   public static void main(String[] args) {
     double SQRT;
     double C, AT, area, AC;
     int H = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hipotenusa:"));
     int R = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio:"));
     C = (H*2-R*2);
     SQRT = (float)Math.sqrt(C);
     AT = 2 * (R * SQRT)/2;
     AC = (3.1416 * R * 2) / 2;
     area = AT + AC;
     JOptionPane.showMessageDialog(null,  "El total es: " + area);
   }
}
