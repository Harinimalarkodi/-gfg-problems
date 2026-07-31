class Solution {
    public String restoreString(String s, int[] indices) {
        char [] a=new char[indices .length];
        int ind=0;
        for(int i=0;i<s.length();i++){
            int num=indices[i];
            a[num]=s.charAt(i);
            
        }
        String s1=new String(a);
        return s1;
        
    }
}