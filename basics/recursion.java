public class recursion {
  public static int Recursion(Integer i, Integer num) {
    if (i > num) {
      return -1;
    }
    System.out.println(i);
    return Recursion(i + 1, num);
  }

  public static void main(String[] args) {
    Recursion(1, 6);
  }
}
