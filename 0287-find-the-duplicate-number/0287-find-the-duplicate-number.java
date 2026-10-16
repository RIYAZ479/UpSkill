class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(!result.add(nums[i])){
                return nums[i];
            }
        }
        return nums.length;
    }
}