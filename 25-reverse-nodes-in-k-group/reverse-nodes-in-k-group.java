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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode crr=head;
        int c=0;
        while(crr!=null && c<k){
            crr=crr.next;
            c++;
        }
        if(c<k) return head;
        ListNode p=reverseKGroup(crr,k);
        ListNode tc=head;
        for(int i=0;i<k;i++){
            ListNode nn=tc.next;
            tc.next=p;
            p=tc;
            tc=nn;
        } 
        return p;
    }
}