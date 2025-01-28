class leftRotateArray {
  public void rotateFn(int[] nums) {
    int temp = nums[0];

    for (int i = 1; i < nums.length; i++) {
      nums[i - 1] = nums[i];
    }
    nums[nums.length - 1] = temp;
  }

  public static void main(String[] args) {
    leftRotateArray lra = new leftRotateArray();
    int[] nums = { 1, 2, 3, 4, 5 };
    lra.rotateFn(nums);
    for (int num : nums) {
      System.out.println(num + " ");
    }
  }
}
