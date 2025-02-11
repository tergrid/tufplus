import java.util.ArrayList;

class fourSum {
  public ArrayList<ArrayList<Integer>> fourSumFn(int[] nums, int target) {
    int n = nums.length;

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      for (int j = i + 1; j < n; j++) {
        if (j != i + 1 && nums[j] == nums[j - 1])
          continue;
        int k = i + 1;
        int l = n - 1;
        while (j < l) {
          int sum = nums[i] + nums[j] + nums[k] + nums[l];
          if (sum < target) {
            k++;
          } else if (sum > target) {
            l--;
          } else {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(nums[k]);
            temp.add(nums[l]);
            ans.add(temp);
            k++;
            l--;
            while (k < l && nums[k] == nums[k - 1])
              k++;
            while (k < l && nums[l] == nums[l + 1])
              l--;
          }
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    fourSum fs = new fourSum();
    int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5 };
    int target = 8;
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ans = (fs.fourSumFn(nums, target));
    System.out.println(ans);
  }
}
