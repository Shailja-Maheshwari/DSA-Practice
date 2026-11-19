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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> v=new ArrayList<>();
        ListNode c=head;
        while(c!=null){
            v.add(c.val);
            c=c.next;
            }
            int l=0;
            int r=v.size()-1;
            while(l<r){
                if(!v.get(l).equals(v.get(r))){
                    return false;
                }
                l++;
                r--;
            }
            return true;
    }
}