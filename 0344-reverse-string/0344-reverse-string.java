class Solution {
    public void reverseString(char[] s) {
        int low=0;
        int right=s.length-1;
        while(low<right){
            char temp=s[low];
            s[low]=s[right];
            s[right]=temp;

            low++;
            right--;
             }
    }
}