class largestSubarray {
  public int largest(int[] nums) {
    long maxi = Long.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum > maxi) {
        maxi = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }

    return (int) maxi;
  }

  public static void main(String[] args) {
    largestSubarray ls = new largestSubarray();

    int[] nums = { 2, 3, 5, -2, 7, -4 };
    int ans = ls.largest(nums);
    System.out.println(ans);
  }
}
