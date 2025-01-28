class isomorphicString {
  public boolean isIsomorphicString(String s, String t) {
    int[] m1 = new int[256], m2 = new int[256];
    int n = s.length();
    for (int i = 0; i < n; i++) {
      if (m1[s.charAt(i)] != m2[t.charAt(i)])
        return false;

      m1[s.charAt(i)] = i + 1;
      m2[t.charAt(i)] = i + 1;
    }
    return true;
  }

  public static void main(String[] args) {
    isomorphicString iso = new isomorphicString();
    String s = "egg";
    String t = "add";
    if (iso.isIsomorphicString(s, t)) {
      System.out.println("Strings are isomorphic");
    } else {
      System.out.println("Strings are not isomorphic");
    }
  }
}
