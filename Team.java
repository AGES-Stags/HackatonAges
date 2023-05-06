public class Team {
  Student[] students;
  String teamName;
  int size;
  
  /**
   * @param teamName
   */
  public Team(String teamName){
    this.teamName = teamName;
    students = new Student[6];
    size = 0;
  }

  /**
   * @param register
   * @param name
   * @param course
   */
  public void add(int register, String name, Course course){
    Student student = new Student(register,name,course);
    students[size] = student;
    size++;
    }
  }     