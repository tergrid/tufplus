import java.util.TreeSet;

class unionArray {
  public int[] unionArrayFn(int[] nums1, int[] nums2) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int num : nums1) {
      set.add(num);
    }
    for (int num : nums2) {
      set.add(num);
    }
    int[] union = new int[set.size()];
    int index = 0;
    for (int num : set) {
      union[index++] = num;
    }
    return union;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 7 };
    int[] nums2 = { 3, 4, 6, 7, 7, 8, 9, 9, 10 };

    unionArray ua = new unionArray();
    int[] union = ua.unionArrayFn(nums1, nums2);

    System.out.println("Union of nums1 and nums2 is: ");
    for (int val : union) {
      System.out.println(val + " ");
    }
    System.out.println();
  }
}
