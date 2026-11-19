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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> a=new ArrayList<>();
        ListNode s=head;
        while(s!=null){
            a.add(s);
            s=s.next;
        }
        int l=0;
        int r=a.size()-1;
        while(l<r){
            a.get(l).next=a.get(r);
            l++;
            if(l==r) break;
            a.get(r).next=a.get(l);
            r--;
        }
        a.get(l).next=null;
    }
}