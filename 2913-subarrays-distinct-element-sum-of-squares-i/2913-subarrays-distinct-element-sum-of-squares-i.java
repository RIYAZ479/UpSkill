class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> set =new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                for(int k=i;k<=j;k++){
                   set.add(nums.get(k));

                }
                sum+=Math.pow(set.size(),2);
                set.clear();
            }
        }
        return sum;

        
    }
}