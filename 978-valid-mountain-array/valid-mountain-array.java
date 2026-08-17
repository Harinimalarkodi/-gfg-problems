class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
        if(arr.length==3){
            if(arr[0]>arr[1]||arr[2]>=arr[1]){
                return false;
            }
        }
        int ind=0;
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
            max=arr[i];
            ind=i;
            }
        }
        if(ind==0 ||ind==arr.length-1){
            return false;
        }
        for(int i=0;i<ind;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=ind+1;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}