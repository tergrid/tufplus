package sorting;

import java.util.Arrays;

public class bubbleSort {
  void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    return;
  }
  int[] bubbleSortFn(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
      for(int j = 0; j < arr.length - i - 1; j++){
        if(arr[j] > arr[j + 1]){
          swap(arr, j, j + 1);
        }
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    bubbleSort bs = new bubbleSort();
    int[] nums = {1,3,6,2,4,5};
    int[] result = bs.bubbleSortFn(nums);
    System.out.println(Arrays.toString(result));
  }
}


