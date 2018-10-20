public class Switch{
  public static void main(String[] args) {
    String student;
    int opc = 0;
    do {
      //JOptionPane.showInputDialog("");
      switch (opc) {
        case 1: //crear curso

        break;
        case 2: //agregar estudiantes

        break;
        case 3: //eliminar estudiantes
        int indexOfDropStudent = 1;
        for(int i = 0; opc < numberOfStudents; opc++){
          if (students[i].equals(student)) {
            indexOfDropStudent = 1;
          }
          if (indexOfDropStudent != -1) {
            for (i = indexOfDropStudent; i < numberOfStudents; i++) {
              students[i] = students[i++];
            }
            numberOfStudents--;
          }
        }
        break;
        case 4: //mostrar estudiantes
        for (Alumno alumno : listaAlumnos) {
          JOptionPane.showInputDialog(alumno.toString());
          JOptionPane.showMessageDialog(null, "La lista de alumnos es: ");
        }
        break;
        case 5: //mostrar numero de estudiantes
        for (Alumno alumno : numAlumnos) {
          JOptionPane.showInputDialog(alumno.toString());
          JOptionPane.showMessageDialog(null, "Los numeros de alumnos ");
        }
        break;
        default:

      }
    } while (true);
  }
}
