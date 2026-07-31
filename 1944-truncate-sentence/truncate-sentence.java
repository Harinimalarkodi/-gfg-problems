class Solution {
    public String truncateSentence(String s, int k) {
        String a[]=s.split(" ");
        String ab[]=new String[k];
        for(int i=0;i<ab.length;i++){
            ab[i]=a[i];
        }
        String a1=String.join(" ",ab);
        return a1;
    }
}