class Solution {
    public int maximumGap(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2){
            return 0;
        }
        for(int i=1;i<=n-1;i++){
            int a=nums[i]-nums[i-1];
            if(a>c){
                c=a;
            }
    
        }
        return c;
        
    }
}