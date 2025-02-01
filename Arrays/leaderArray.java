import java.util.ArrayList;
import java.util.Collections;

class leaderArray {
  public ArrayList<Integer> leaders(int[] nums) {
    ArrayList<Integer> al = new ArrayList<>();
    int n = nums.length;
    int maxFromRight = nums[n - 1];
    al.add(maxFromRight);

    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] > maxFromRight) {
        al.add(nums[i]);
        maxFromRight = nums[i];
      }
    }
    Collections.reverse(al);
    return al;
  }

  public static void main(String[] args) {
    leaderArray la = new leaderArray();
    int[] nums = { 1, 2, 5, 3, 4, 1 };
    ArrayList<Integer> ans = new ArrayList<>();
    ans = la.leaders(nums);
    for (int answer : ans) {
      System.out.println(answer);
    }
  }
}
