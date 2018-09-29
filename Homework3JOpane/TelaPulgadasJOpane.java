import javax.swing.JOptionPane;
public class TelaPulgadasJOpane {
  public static void main(String[] args) {

    double CM = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de metros requerida: "));
    double PG = Integer.parseInt(JOptionPane.showInputDialog(null, "Pulgadas a pedir: "));

    PG = CM/2.54;
    JOptionPane.showMessageDialog(null, "La cantidad de pulgadas es: " + PG);
  }
}
