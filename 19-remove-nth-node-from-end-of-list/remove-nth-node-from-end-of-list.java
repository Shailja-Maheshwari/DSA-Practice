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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> a=new ArrayList<>();
      ListNode c = head;
          while(c!=null){
            a.add(c.val);
            c=c.next;
          }
          int ri=a.size()-n;
          ListNode d=new ListNode(0);
          ListNode t=d;
          for(int i=0;i<a.size();i++){
            if(i!=ri){
                t.next= new ListNode(a.get(i));
                t=t.next;
            }
          }
          return d.next;
    }
}