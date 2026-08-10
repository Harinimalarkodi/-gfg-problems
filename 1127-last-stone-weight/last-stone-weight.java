class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer>a=new ArrayList<>();
        for(int i:stones){
            a.add(i);
        }
        while(a.size()>1){
            Collections.sort(a);
            int b=a.get(a.size()-1);
            int c=a.get(a.size()-2);
            if(b==c){
                a.remove(a.get(a.size()-1));
                a.remove(a.get(a.size()-1));
                a.add(0);
            }
            else{
                a.remove(a.get(a.size()-1));
                a.remove(a.get(a.size()-1));
                a.add(Math.abs(c-b));
            }
        }
        return a.get(0);
    }
}