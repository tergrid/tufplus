import java.util.*;

public class sortCharByFrequency {
  class Pair {
    int freq;
    char ch;

    Pair(int f, Character c) {
      this.freq = f;
      this.ch = c;
    }
  }

  public List<Character> frequencySort(String s) {
    // Frquency array for characters 'a' to 'z';
    Pair[] freq = new Pair[26];
    for (int i = 0; i < 26; i++) {
      freq[i] = new Pair(0, (char) (i + 'a'));
    }

    // count frequency of each Character
    for (char ch : s.toCharArray()) {
      freq[ch - 'a'].freq++;
    }

    // sort based on Frquency (descending) and alphabetically (ascending)

    Arrays.sort(freq, (p1, p2) -> {
      if (p1.freq != p2.freq)
        return p2.freq - p1.freq;
      return p1.ch - p2.ch;
    });

    // Collect Result
    List<Character> result = new ArrayList<>();
    for (Pair p : freq) {
      if (p.freq > 0)
        result.add(p.ch);
    }
    return result;
  }

  public static void main(String[] args) {
    sortCharByFrequency scbf = new sortCharByFrequency();
    String s = "tree";
    List<Character> result = scbf.frequencySort(s);
    System.out.println(result);
  }
}
