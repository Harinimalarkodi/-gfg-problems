class Solution {
    public String reverseOnlyLetters(String s) { 
        char c[]=s.toCharArray();
         int start=0;
        int end=c.length-1;
        while(start<end){
            if(Character.isLetter(c[start])&&Character.isLetter(c[end])){
                char temp=c[start];
                c[start]=c[end];
                c[end]=temp;
                start++;
                end--;
            }
            else if(!Character.isLetter(c[start])){
                start++;

            }
            else
            {
                end--;
            }
        }
        String s1=new String(c);
        return s1;
        
    }
}