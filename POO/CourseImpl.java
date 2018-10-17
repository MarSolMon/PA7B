import javax.swing.*;
public class CourseImpl{
  public static void main(String[] args) {
    int opc = 0;
    do {
      JOptionPane.showInputDialog(arg0);
      switch(opc){
        case 1:
        //crear curso
        break;
        case 2:
        //agregar estudiantes
        break;
        case 3:
        //eliminar estudiantes
        break;
        case 4:
        //mostrar estudiantes
        break;
        case 5:
        //mostrar numero de estudiantes
        break;
        default:
          //mensaje de eliga opcion correcta
      }
    } while (true);

    Course curso1 = new Course();
    //curso1.courseName = "Ingles";
    curso1.setCourseName("Ingles");
    curso1.addStudents("Luis Alberto");
    curso1.addStudents("Maria");
    curso1.addStudents("Lucero");

    String[] studentsDeIngles = curso1.getStudents();
    String students="";
    for(int i = 0; i < curso1.getNumberOfStudents(); i ++){
      students += studentsDeIngles[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, students);

    Course curso2 = new Course();
    curso2.setCourseName("Mate");
    curso2.addStudents("Brandon");
    curso2.addStudents("Angel");
    curso2.addStudents("Steven");

    JOptionPane.showMessageDialog(null, curso1.getCourseName());
    JOptionPane.showMessageDialog(null, curso2.getCourseName());

    Course curso3 = new Course("Programacion");
    curso3.addStudents("Agustin");
    curso3.addStudents("Juan Carlos");
    curso3.addStudents("You");
  }
}
