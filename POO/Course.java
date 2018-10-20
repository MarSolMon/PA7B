public class Course{
  private String courseName;
  private String[] students = new String[100]; //Declaración de array
  private int numberOfStudents = 0;

  public Course(){

  }
  public Course(String courseName){
    this.courseName = courseName;
  }

  public String getCourseName(){
    return this.courseName;
  }

  public void setCourseName(String courseName){
    this.courseName = courseName;
  }

  public void addStudents(String student){
    this.students[numberOfStudents] = student;
    this.numberOfStudents ++;
  }

  public void dropStudent(String student){ //eliminar estudiantes

    int indexOfDropStudent = 1;
    for(int i = 0; i < numberOfStudents; i++){
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
  }

  public String[] getStudents(){
    return this.students;
  }

  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }
}
