public class maxConsecutive {
  public int maxConsecutiveFn(int[] nums) {
    int maxCount = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count += 1;
        maxCount = Math.max(maxCount, count);
      } else {
        count = 0;
      }
    }
    return maxCount;
  }

  public static void main(String[] args) {
    maxConsecutive mcf = new maxConsecutive();
    int[] nums = { 1, 1, 0, 0, 1, 1, 1, 0, 0 };
    int ans = mcf.maxConsecutiveFn(nums);
    System.out.println("max consecutive 1s are " + ans);
  }
}
