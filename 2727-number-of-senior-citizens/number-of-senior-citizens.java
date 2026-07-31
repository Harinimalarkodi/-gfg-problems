class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int i=0;i<details.length;i++){
            String a=details[i];
            String b=a.substring(11,13);
            int n=Integer.parseInt(b);
            if(n>60){
                count++;
            }
            
        }
        return count;
    }
}