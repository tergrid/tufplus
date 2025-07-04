public class functionOverriding{
  
  public static class student{
    private String name;
    private int age;
    private int roll;

    public void studentFn(String name, int age){
      this.name = name;
      this.age = age;
    }
    public void studentFn(String name, int age, int roll){
      this.name = name;
      this.age = age;
      this.roll = roll;
    }
  }

  public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student();

    s1.studentFn("Harshit", 21);
    s2.studentFn("Harshit", 21, 123);
    System.out.println();
  }
}
