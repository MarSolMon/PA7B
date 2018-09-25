import javax.swing.JOptionPane;
public class FactorialWhileLoop{
  public static void main(String[] args) {
//Numero para el limite factorial
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter int value"));
//numero del factorial
    int fact = 1;
    //Sentinela
    int i = 1;
    while(i<=value){
      fact = fact * i;
      i++;
    }
    JOptionPane.showInputDialog(null, "El factorial de: " + value + "es" + fact, "Calcular Factorial", JOptionPane.WARNING_MESSAGE);
  }
}
