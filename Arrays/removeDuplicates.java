class removeDuplicates {
  public int removeDuplicatesFn(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 3, 3 };
    removeDuplicates rd = new removeDuplicates();
    int k = rd.removeDuplicatesFn(arr);
    System.out.println("the array after removing duplicates is ");
    for (int i = 0; i < k; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }
}
