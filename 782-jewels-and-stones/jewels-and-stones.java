class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        List<Character>a=new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            a.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(a.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}