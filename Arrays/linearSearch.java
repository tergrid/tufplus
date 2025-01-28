package Arrays;

class linearSearch {
    public int linearSearchArray(int[] nums, int target){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println(ls.linearSearchArray(nums, target));
        System.out.println("Index of target element is: " + ls.linearSearchArray(nums, target));      
    }
}