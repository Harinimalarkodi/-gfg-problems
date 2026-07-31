class Solution {
    public String convert(String s, int numRows) {
        int arr[]=new int[s.length()];
        int ind=0;
        int l=s.length();
        while(ind<l){
            for(int i=1;i<=numRows&&ind<l;i++){
                arr[ind]=i;
                ind++;
            }
            for(int i=numRows-1;i>=2&&ind<l;i--){
                arr[ind]=i;
                ind++;
            }
        }
        String res="";
        for(int i=1;i<=numRows;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    res+=s.charAt(j);
                }
            }
        }
        return res;
    }
}