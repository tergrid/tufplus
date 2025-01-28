public class rotateString {
  public boolean rotateStrings(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }
    for (int i = 0; i < s.length(); i++) {
      String rotated = s.substring(i) + s.substring(0, i);
      if (rotated.equals(goal)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    rotateString rs = new rotateString();
    System.out.println(rs.rotateStrings("abcde", "bcdea"));
    System.out.println(rs.rotateStrings("abcde", "abced"));

  }
}
