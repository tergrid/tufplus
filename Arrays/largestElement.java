class largestElement {
  public int largestElementArray(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    largestElement le = new largestElement();
    int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(le.largestElementArray(nums));
  }
}
