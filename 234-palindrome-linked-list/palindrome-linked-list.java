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
        ListNode d = new ListNode(0);
        ListNode temp = d;
        ListNode temp3 = head;
        ListNode prev = null;

        while (temp3 != null) {
           
            temp.next = new ListNode(temp3.val);
            temp = temp.next;

            ListNode next = temp3.next;
            temp3.next = prev;
            prev = temp3;
            temp3 = next;
        }
        ListNode temp1 = d.next;

        while (prev != null && temp1 != null) {
            if (prev.val != temp1.val) {
                return false;
            }
            prev = prev.next;
            temp1 = temp1.next;
        }

        return true;
    }
}
