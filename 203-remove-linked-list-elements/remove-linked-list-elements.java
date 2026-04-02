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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode head1 = new ListNode(-1);
        ListNode temp1 = head1;
        while(temp != null)
        {
               if(temp.val != val){
                temp1.next = new ListNode(temp.val);
                temp1 = temp1.next;
               }
               temp = temp.next;
            
        }
        return head1.next;
    }
}