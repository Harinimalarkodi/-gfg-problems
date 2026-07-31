class Solution {
    public String sortSentence(String s) {
        String [] s1=s.split("\\s+");
        String[] b=new String[s1.length];
        for(int i=0;i<s1.length;i++){
            String a=s1[i];
            int n=a.charAt(a.length()-1)-'0';
            b[n-1]=a.substring(0,(a.length()-1));
        }
        return String. join(" ",b);
         
        
    }
}