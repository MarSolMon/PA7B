import javax.swing.JOptionPane;
public class AreaCircunferenciaJOpane {
   public static void main(String[] args) {
        double area;
        int R = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio:"));
        area = (3.1416 * R * 2);
        JOptionPane.showMessageDialog(null,  "El area total es: " + area);
     }
}
