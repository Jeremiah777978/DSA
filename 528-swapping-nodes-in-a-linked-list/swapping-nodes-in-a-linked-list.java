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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode temp2 = head;
        int size = 0;
        int a = 0;
        int j = 0;
        while(temp2 != null)
        {
            size = size+1;
            temp2 = temp2.next;
        }
         size = size-k;
        for(j = 0;j<k-1;j++)
        {
            temp = temp.next;
        }
         ListNode temp1 = head;
          j = 0;
        while(j<size)
        {
            temp1 = temp1.next;
            j++;
        }
       int val = temp.val;
        temp.val = temp1.val;
        temp1.val = val;

             return head;
    }
}