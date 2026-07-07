class Solution {
    public int findMin(int[] nums) {
        int lowest = nums[0];
        for(int num: nums){
            if(lowest > num){
                return num;
            }
        }
        return lowest;
    }
}
