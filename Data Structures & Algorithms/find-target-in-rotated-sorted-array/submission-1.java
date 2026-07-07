class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
               target = i;
               return target;
            }
        }
        return -1;
    }
}
