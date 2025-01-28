package Hashing;

import java.util.HashMap;

class sumOfHighestAndLowestFrequency {
  public int sumOfHighestAndLowestFrequencies(int[] nums) {
    int n = nums.length;
    int maxFreq = 0, minFreq = n;

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < n; i++) {
      hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
    }
    for (int freq : hm.values()) {
      maxFreq = Math.max(maxFreq, freq);
      minFreq = Math.min(minFreq, freq);
    }
    return maxFreq + minFreq;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3, 3, 3 };
    sumOfHighestAndLowestFrequency sohalf = new sumOfHighestAndLowestFrequency();
    int ans = sohalf.sumOfHighestAndLowestFrequencies(nums);

    System.out.println("The sum of the highest and the lowest frequency in the array is: " + ans);
  }
}
