import javax.swing.*;
public class CourseImpl{
  public static void main(String[] args) {
    Course curso1 = new Course();
    //curso1.courseName = "Ingles";
    curso1.setCourseName("Ingles");
    curso1.addStudents("Luis Alberto");
    curso1.addStudents("Maria");
    curso1.addStudents("Lucero");

    String[] studentsDeIngles = curso1.getStudents();
    String students = "";
    for(int i = 0; i < curso1.getNumberOfStudents(); i ++){
      students += studentsDeIngles[i] + "\n";
    }

    Course curso2 = new Course();
    curso2.setCourseName("Mate");
    curso2.addStudents("Brandon");
    curso2.addStudents("Angel");
    curso2.addStudents("Steven");

    JOptionPane.showMessageDialog(null, curso1.getCourseName());
  }
}
