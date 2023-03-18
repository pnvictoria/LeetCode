class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; nums.length > i; i++) {
            for(int j=i; nums.length-1 > j; j++) {
                if(nums[i] + nums[j+1] == target) {
                    return new int[]{i,j+1};
                }
            }
        }
        return null;
    }
}