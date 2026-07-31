class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(String ch:op){
            if(ch.equals("--X")||ch.equals("X--")){
                x--;
            }
            else{
                x++;
            }
            
        }
       return x; 
    }
}