class moveZeroes {
  public void moveZeroesFn(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    moveZeroes mz = new moveZeroes();
    int[] nums = { 0, 20, 0, -20, 20, 0 };
    mz.moveZeroesFn(nums);
  }
}
