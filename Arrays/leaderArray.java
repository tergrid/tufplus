import java.util.ArrayList;

class leaderArray {
  public ArrayList<Integer> leaders(int[] nums) {
    ArrayList<Integer> al = new ArrayList<>();
    int n = nums.length;
    int maxFromRight = nums[n - 1];
    al.add(maxFromRight);

    for (int num = n - 1; num >= 0; num--) {
      if (maxFromRight < nums[num]) {
        maxFromRight = nums[num];
        al.add(nums[num]);
      } else if (nums[num] < maxFromRight) {
        maxFromRight = nums[num];
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = al.size() - 1; i >= 0; i--) {
      result.add(al.get(i));
    }

    return result;
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
