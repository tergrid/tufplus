class missingNumber {
  public int missingNumberFn(int[] nums) {
    int n = nums.length;
    int expectedSum = (n * (n + 1)) / 2;
    int actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }
    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 3, 4, 5, 6 };
    missingNumber mn = new missingNumber();
    System.out.println(mn.missingNumberFn(arr));
  }
}
