class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String s1[]=s.split(" ");
        int start=0;
        int end=s1.length-1;
        for(int i=0;i<s1.length;i++){
           String a1=s1[i];
           String rev="";
           for(int j=a1.length()-1;j>=0;j--){
            rev=rev+a1.charAt(j);
            
            }
            s1[i]=rev;
        }
         String s3=String.join(" ",s1);
         return s3;
    }
}