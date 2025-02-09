import java.util.ArrayList;
import java.util.Arrays;

class threeSum {
  public ArrayList<ArrayList<Integer>> threeSumFn(int[] nums) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    int n = nums.length;

    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;

      int j = i + 1;
      int k = n - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          ArrayList<Integer> temp = new ArrayList<>();
          temp.add(nums[i]);
          temp.add(nums[j]);
          temp.add(nums[k]);
          ans.add(temp);

          j++;
          k--;
          while (j < k && nums[j] == nums[j - 1])
            j++;
          while (j < k && nums[k] == nums[k + 1])
            k--;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };
    threeSum ts = new threeSum();
    ArrayList<ArrayList<Integer>> sol = new ArrayList<>();

    sol = ts.threeSumFn(nums);
    for (ArrayList<Integer> triplet : sol) {
      System.out.print("[");
      for (int num : triplet) {
        System.out.print(num + " ");
      }
      System.out.print("]");
    }
    System.out.println();

  }
}
