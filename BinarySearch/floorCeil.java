class floorCeil{
  public int findFloor(int[] nums,int n, int x){
    int low = 0, high = n - 1;
    int ans = -1;
    while (low <= high) {
      int mid = (low + high)/2;
      
      if(nums[mid]<=x){
        ans = nums[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ans;
  }
  public int findCeil(int[] nums, int n, int x){
    int low = 0, high = n - 1;
    int ans = -1;

    return ans;
  } 
  public static void main(String[] args) {

  }
}
