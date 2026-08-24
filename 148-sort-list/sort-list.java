/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer>a=new ArrayList<>();
           ListNode temp=head;
           while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
           }
            Collections.sort(a);
           ListNode  ans=null;
            ListNode tail=null;
            for(int j:a){
                ListNode i=new ListNode(j);
                if(ans==null){
                    ans=i;
                    tail=i;
                }
                else{
                    tail.next=i;
                    tail=i;
                }
            }
            return ans ;
    }
}