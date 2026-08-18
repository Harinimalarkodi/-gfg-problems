class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public int largestInteger(int[] nums, int k) {
        a.clear();
        for(int i=0;i<nums.length;i++){
            List<Integer>b=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                b.add(nums[j]);
                if(b.size()==k){
                    a.add(b);
                    break;
                }
            }
        }
        HashMap<Integer,Integer>c=new HashMap<>();
    for(List<Integer>i:a){
        HashSet<Integer>v=new HashSet<>(i);
        for(int j:v){
            c.put(j,c.getOrDefault(j,0)+1);
        }
    }
   int n=-1;
   
	for(Map.Entry<Integer,Integer>entry:c.entrySet()){
	    if(entry.getValue()==1){
	        if(entry.getKey()>n){
	            n=entry.getKey();
	        }
	    }
	}
           return n;
    }
}