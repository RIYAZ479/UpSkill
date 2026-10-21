class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                b=Math.max(b,count);
            }else{
                count=0;
               
                
            }

        }
        return b;

        
    }
}