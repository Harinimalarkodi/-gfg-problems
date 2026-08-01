class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>a=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                int n=Integer.bitCount(i)+Integer.bitCount(j);
                if(n==turnedOn){
                    String res=i+":"+(j<10?"0"+j:j);
                    a.add(res);
                }
            }

        }
        return a;
    }
}