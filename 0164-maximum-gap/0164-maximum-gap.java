class Solution {
    public int maximumGap(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++){
            int a=nums[i]-nums[i-1];
            c=Math.max(c,a);
    
        }
        return c;
        
    }
}