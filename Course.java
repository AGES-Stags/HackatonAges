public enum Course {
  ES("Engenharia de Software"),
  SI("Sistemas de Informação");
  private String course;

  /**
   * @param Course
   */
  Course(String Course){
    this.course = course;
  }

  public String toString(){
    return this.course;
  }
}
