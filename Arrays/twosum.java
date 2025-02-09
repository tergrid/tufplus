import java.util.Arrays;

class twosum {
  public int[] twosumFn(int[] nums, int target) {
    int[] pair = new int[2];
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      for (int j = nums.length - 1; j >= 0; j--) {
        if (nums[i] + nums[j] == target) {
          pair[0] = i;
          pair[1] = j;
          return pair;
        } else if (nums[i] + nums[j] < target) {
          i++;
        } else if (nums[i] + nums[j] > target) {
          j--;
        }
      }
    }
    return pair;
  }

  public static void main(String[] args) {
    twosum ts = new twosum();
    int[] nums = { 2, 6, 5, 8, 11 };
    int target = 14;
    int[] ans = ts.twosumFn(nums, target);
    System.out.println(Arrays.toString(ans));
  }
}
