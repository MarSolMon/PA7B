import javax.swing.JOptionPane;
public class ForLoop1{
  public static void main(String[] args) {
    int tabla, i;
    String result;
    do {
      tabla = Integer.parseInt(JOptionPane.showInputDialog("Enter an int value the program exits if the input is 0"));
      result += (tabla + " x " + (i + 1) + " = " + (i + 1)* tabla + "\n");;
    } while (result =0);
  }
}
