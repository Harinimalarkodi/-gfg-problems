class Solution {
    public int countPoints(String rings) {
        String arr[]=new String[10];
        Arrays.fill(arr,"");
        for(int i=1;i<rings.length();i=i+2){
            char ri=rings.charAt(i-1);
            char ro=rings.charAt(i);
            int n=ro-'0';
            if(arr[n].indexOf(ri)==-1){
                arr[n]+=ri;
            }
            

        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i].length();
            if(n==3){
                count++;
            }
        }
        return count;
    }
}