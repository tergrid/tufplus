class lowerBound {
  public int lowerBoundFn(int[] nums, int x) {
    int low = 0, high = nums.length - 1;
    int ans = nums.length;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] >= x) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    lowerBound lb = new lowerBound();
    int[] nums = { 0, 1, 2, 2, 3, 3, 4, 5 };
    int ans = lb.lowerBoundFn(nums, 2);
    System.out.println(ans);
  }
}
