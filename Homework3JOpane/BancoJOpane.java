import javax.swing.JOptionPane;
public class BancoJOpane{
  public static void main(String[] args) {
    double NC;
    double AC;
    int TT = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de tarjeta:"));
    double LA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese limite actual del credito:"));
    if (TT == 1){
      AC = LA * 0.25;
    }else if (TT == 2){
      AC = LA * 0.35;
    }else if (TT ==3){
      AC = LA * 0.40;
    }else{
    AC = LA * 0.50;
    }
    NC = AC + LA;

    JOptionPane.showMessageDialog(null,  "El nuevo limite de credito es: " + NC);
  }
}
