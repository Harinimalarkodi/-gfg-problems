class Solution {
    public boolean areNumbersAscending(String s) {
        String a[]=s .split(" ");
        ArrayList<Integer> ab=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            String ar=a[i];
            if(Character.isDigit(ar.charAt(0))){
                ab.add(Integer.parseInt(ar));
            }
        }
        int arr[] = new int[ab.size()];
for (int i = 0; i < ab.size(); i++) {
    arr[i] = ab.get(i);
}

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
            
        }
        return true;
        
    }
}