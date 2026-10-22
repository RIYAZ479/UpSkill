class Solution {
    public boolean checkRecord(String s) {
        int l=0;
        int c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                count++;
               c=Math.max(c,count);
               if(c>=3){
                return false;
               }
            }else if(s.charAt(i)=='A'){
                count=0;
                l++;
                if(l>=2){
                    return false;
                }
            }else{
                count=0;
            }
        
    }
    return c<3&&l<2;
}
}