import javax.swing.JOptionPane;
public class SueldoTrabajadorJOpane {
  public static void main(String[] args) {
    double SS;
    double HT = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte las horas trabajadas: "));
    double PH = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el pago por hora: "));

    SS = HT * PH;
    JOptionPane.showMessageDialog(null, "Salario semanal es: " + SS);
  }
}
