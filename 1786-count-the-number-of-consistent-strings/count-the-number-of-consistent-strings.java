class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
       TreeSet<Character>b=new TreeSet<>();
       for(char ch:allowed.toCharArray()){
        b.add(ch);
       }
       for(String i: words) {
        TreeSet<Character>a=new TreeSet<>();
        boolean has=true;
        for(char ch:i.toCharArray()){
            if(!b.contains(ch)){
                has=false;
                break;

            }
        }
        if(has==true){
            count++;
        }
        
       }
       return count;
    }
}