class Solution {
    public boolean checkRecord(String s) {
        int l=0;
        int c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                count++;
               c=Math.max(c,count);
            }else if(s.charAt(i)=='A'){
                count=0;
                l++;
            }else{
                count=0;
            }
        
    }
    return c<3&&l<2;
}
}