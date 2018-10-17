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
  public void dropStudent(String student){

  }
  public String[] getStudents(){
    return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }
}
