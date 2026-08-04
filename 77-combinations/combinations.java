class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        int index=0;
        for(int i=1;i<=n;i++){
            arr[index]=i;
            index++;
        }
        subset(arr,0,new ArrayList<>(),k);
        return a;
    }
    public void subset(int []arr,int ind,List<Integer>b,int k){
        if(b.size()==k){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            b.add(arr[i]);
            subset(arr,i+1,b,k);
            b.remove(b.size()-1);
        }
    }
}