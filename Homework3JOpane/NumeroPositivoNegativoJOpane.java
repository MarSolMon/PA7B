import javax.swing.JOptionPane;
public class NumeroPositivoNegativoJOpane{
  public static void main(String[] args) {
    int NUM;
    String R;
    NUM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
    if (NUM >= 0) {
      R = "POSITIVE";
    }else{
      R = "NEGATIVE";
    }
    JOptionPane.showMessageDialog(null, "El numero es: " + R);
  }
}
