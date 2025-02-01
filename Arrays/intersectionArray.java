import java.util.ArrayList;

class intersectionArray {
  public int[] intersectionArrayFn(int[] nums1, int[] nums2) {
    ArrayList<Integer> al = new ArrayList<>();
    int i = 0, j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums2[j] < nums1[i]) {
        j++;
      } else {
        al.add(nums1[i]);
        i++;
        j++;
      }
    }
    int[] ans = new int[al.size()];
    for (int k = 0; k < ans.length; k++) {
      ans[k] = al.get(k);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 3, 4, 5 };
    int[] nums2 = { 3, 4, 5, 6 };
    intersectionArray ia = new intersectionArray();
    int[] ans = ia.intersectionArrayFn(nums1, nums2);

    System.out.println("Intersection of nums1 and nums2 is:");
    for (int val : ans) {
      System.out.println(val + " ");
    }
    System.out.println();
  }
}
