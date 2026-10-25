class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int v=coins;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=v){
                count++;
                v=v-costs[i];
            }

        }
        return count;
        
    }
}