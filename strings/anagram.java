import java.util.Arrays;

public class anagram {
  public boolean checkAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();
    Arrays.sort(sArray);
    Arrays.sort(tArray);

    return Arrays.equals(sArray, tArray);
  }

  public static void main(String[] args) {
    anagram ag = new anagram();
    String str1 = "INTEGER";
    String str2 = "TEGERNI";
    System.out.println(ag.checkAnagram(str1, str2));

  }
}
