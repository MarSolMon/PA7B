import javax.swing.JOptionPane;
public class AreaTerrenoJOpane {
  public static void main(String[] args) {
    double area;
    double AR;
    double AT;
    int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base del terreno:"));
    int AC = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del terreno:"));
    AT = (AC/2*base/2);
    AR = (AC/2*base);
    area = (AT+AR);
    JOptionPane.showMessageDialog(null, "El Area total del Terreno: " + area);
  }
}
