class Solution {
    public int[] finalPrices(int[] prices) {
        
        int arr[]=prices.clone();
        int ind=0;
        Stack<Integer>a=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!a.isEmpty()&&prices[i]<=prices[a.peek()]){
                 int index = a.pop();

                arr[index] = prices[index] - prices[i];
            }

            a.push(i);
        }
            
            
        
        return arr;
    }
}