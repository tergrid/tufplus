class binarySearch {
  public int func(int[] nums, int low, int high, int target) {
    if (low > high)
      return -1;
    int ind;
    int mid = (low + high) / 2;
    if (nums[mid] == target)
      ind = mid;
    else if (nums[mid] > target)
      ind = func(nums, low, mid - 1, target);
    else
      ind = func(nums, mid + 1, high, target);
    return ind;
  }

  public int search(int[] nums, int target) {
    int n = nums.length;
    return func(nums, 0, n - 1, target);
  }

  public static void main(String[] args) {
    binarySearch bs = new binarySearch();
    int[] nums = { -1, 0, 2, 3, 4, 5, 6, 7 };
    int ind = bs.search(nums, 0);
    if (ind == -1)
      System.out.println("target not present in the array");
    else
      System.out.println("the target is presenat at: " + ind);
  }
}
