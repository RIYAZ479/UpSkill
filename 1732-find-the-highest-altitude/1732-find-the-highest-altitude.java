class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int c=0;
        for(int i=0;i<gain.length;i++){
            int b=a+gain[i];
            c=Math.max(c,b);
            a=b;
        }
        return c;
        
        
    }
}