class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                a=nums[i];
            }
            set.add(nums[i]);
        }
        return a;
        
    }
}