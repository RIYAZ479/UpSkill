class Solution {
    public int[] diStringMatch(String s) {
        int arr[]=new int[s.length()+1];
        int low=0;
        int high=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=low;
                low++;
            }else{
                arr[i]=high;
                high--;
            }
                
            }
            arr[s.length()]=low;
        return arr;
        
    }
}