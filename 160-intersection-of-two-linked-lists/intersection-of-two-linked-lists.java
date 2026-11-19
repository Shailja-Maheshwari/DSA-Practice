/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode f=headA;
        ListNode s=headB;
        while(f!=s){
            f=(f!=null)? f.next : headA;
            s=(s!=null)? s.next : headB;
        }
        return f;
        
    }
}