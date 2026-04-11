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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem  = 0;
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;
        while(l1 != null || l2 != null || rem>=1)
        {
            int a = 0;
            if(l1 != null)
            {
                a += l1.val;
                l1 = l1.next;
            }
            if(l2  != null)
            {
                 a += l2.val;
                l2 = l2.next;
            }
            a = a+rem;
            rem = a/10;
            a = a%10;
            dummy.next = new ListNode(a);
            dummy = dummy.next;

        }
        return temp.next;
    }
}