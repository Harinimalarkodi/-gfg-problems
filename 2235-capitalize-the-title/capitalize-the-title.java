class Solution {
    public String capitalizeTitle(String title) {
        
        String [] s=title.toLowerCase().split(" ");
        int ind=0;
        for(int  i=0;i<s.length;i++){
            String s1=s[i];
            int n=s1.length();
            if(n>2){
                s[ind]=s1.substring(0,1).toUpperCase()+s1.substring(1);
                ind++;


            }
            else
            {
                s[ind]=s1;
                ind++;
            }
        }
        String a=String.join(" ", s);
        return a;

    }
}