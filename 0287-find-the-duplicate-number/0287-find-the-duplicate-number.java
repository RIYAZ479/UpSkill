class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                a=nums[i];
            }
        }
        return a;
        
    }
}