import javax.swing.JOptionPane;
public class ProduccionLecheJOpane {
  public static void main(String[] args) {
    double GA;
    double TG;

    int L = Integer.parseInt(JOptionPane.showInputDialog(null, "Litros a entregar: "));
    double PG = Integer.parseInt(JOptionPane.showInputDialog(null, "Precio del galon: "));
    TG = (L / 3.785);
    JOptionPane.showMessageDialog(null, "Cantidad de galones: " + TG);
    GA = PG * TG;
    JOptionPane.showMessageDialog(null, "Ganancia obtenida es: " + GA);
  }
}
