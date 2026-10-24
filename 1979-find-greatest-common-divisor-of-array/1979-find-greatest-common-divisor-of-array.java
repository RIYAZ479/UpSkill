class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int arr[]=new int [2];
        arr[0]=nums[0];
        arr[1]=nums[nums.length-1];
        for(int i=1;i<=arr[0];i++){
           if(arr[0]%i==0&&arr[1]%i==0){
              c=i;
           }

           
        }
        return c;


        
    }
}