class secondLargest {
  public int secondLargestFn(int[] nums) {
    if (nums.length < 2) {
      return -1;
    }
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        secondLargest = largest;
        largest = nums[i];
      } else if (nums[i] > secondLargest && nums[i] != largest) {
        secondLargest = nums[i];
      }
    }
    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
    secondLargest sl = new secondLargest();
    int sL = sl.secondLargestFn(nums);
    System.out.println("Second largest elemtn is: " + sL);
  }
}
