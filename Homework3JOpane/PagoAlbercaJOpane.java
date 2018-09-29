import javax.swing.JOptionPane;
public class PagoAlbercaJOpane {
  public static void main(String[] args) {
    double V;
    double PAG;
    double A = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura de la alberca: "));
    double L = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el largo de la alberca: "));
    double N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ancho de la alberca: "));
    V = (A * L * N);
    double CM = Integer.parseInt(JOptionPane.showInputDialog(null, "Costo en metros: "));
    PAG = V * CM;
    JOptionPane.showMessageDialog(null, "Pago a realizar es: " + PAG);
  }
}
