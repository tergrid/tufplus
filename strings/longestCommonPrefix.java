import java.util.*;

public class longestCommonPrefix {
  public String longestCommonPrefix1(String[] v) {
    StringBuilder ans = new StringBuilder();
    Arrays.sort(v);
    String first = v[0];
    String last = v[v.length - 1];

    for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        return ans.toString();
      }
      ans.append(first.charAt(i));
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    longestCommonPrefix lcp = new longestCommonPrefix();
    String[] input = { "flower", "flow", "flight" };
    String result = lcp.longestCommonPrefix1(input);
    System.out.println("Longest Common Prefix: " + result);
  }
}
