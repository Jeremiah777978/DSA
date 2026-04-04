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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = new ListNode(0);
        ListNode dummy = temp1;
       int a = Integer.MAX_VALUE;
        while(temp != null)
        {
            
             if( temp.next != null && temp.val == temp.next.val || a == temp.val)
            {
                  a = temp.val;
                temp = temp.next;

            }
    
            else
            {
                dummy.next = new ListNode(temp.val);
                dummy = dummy.next;
                 temp = temp.next;
            }
        }
        return temp1.next;
    }
}