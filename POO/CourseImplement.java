import javax.swing.*;
public class CourseImplement{
  public static void main(String[] args) {
    Course curso1 = new Course();
    curso1.setCourseName("Ingles");
    curso1.addStudents("Luis Alberto");
    curso1.addStudents("Maria");
    curso1.addStudents("Lucero");

    String[] studentsDeIngles = curso1.getStudents();
    String students = "";
    for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
      students += studentsDeIngles[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, students);

    Course curso2 = new Course();
    curso2.setCourseName("Mate");
    curso2.addStudents("Brandom");
    curso2.addStudents("Angel");
    curso2.addStudents("Steven");

    JOptionPane.showMessageDialog(null, curso1.getCourseName());
    JOptionPane.showMessageDialog(null, curso2.getCourseName());

    Course curso3 = new Course();
    curso3.setCourseName("Programacion");
    curso3.addStudents("Agustin");
    curso3.addStudents("Juan Carlos");
    curso3.addStudents("You");

    JOptionPane.showMessageDialog(null, curso3.getCourseName());
  }
}
