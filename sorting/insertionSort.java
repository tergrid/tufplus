package sorting;

import java.util.Arrays;

public class insertionSort {
  void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public int[] insertionSortFn(int[] nums){
    for(int i = 0 ; i <= nums.length - 1 ; i++){
      int j = i;
      while(j > 0 && nums[j] < nums[j - 1]){
        swap(nums, j-1, j);
        j--;
      }
    }
    return nums;
  }
  public static void main(String[] args) {
    insertionSort is = new insertionSort();
    int[] nums = {2,5,1,3,6,4};
    int[] result = is.insertionSortFn(nums);
    System.out.println(Arrays.toString(result));
  }
}
