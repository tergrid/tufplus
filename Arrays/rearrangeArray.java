import java.util.Arrays;

class rearrangeArray {
  public int[] rearrangeArrayFn(int[] nums) {
    int n = nums.length;
    int arr[] = new int[n];

    int posIndex = 0;
    int negIndex = 1;

    for (int i = 0; i < n; i++) {
      if (nums[i] < 0) {
        arr[negIndex] = nums[i];
        negIndex += 2;
      } else {
        arr[posIndex] = nums[i];
        posIndex += 2;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    rearrangeArray ra = new rearrangeArray();
    int[] nums = { 1, -2, 3, 4, -5, -6 };
    Arrays.toString(ra.rearrangeArrayFn(nums));
  }
}
