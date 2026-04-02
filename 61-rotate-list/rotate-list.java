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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        List<Integer> l1 = new ArrayList<>();
        while(temp != null)
        {
          l1.add(temp.val);
          temp = temp.next;
        }
        if(l1.size() == 0)
        {
            return head;
        }
        k = k % l1.size();
        for( int i=0;i<k;i++)
        {
            int a = l1.get(l1.size()-1);
            l1.add(0,a);
            l1.remove(l1.size()-1);
        }
        ListNode head1 = new ListNode(l1.get(0));
         ListNode temp1 = head1;
        for( int i = 1;i<l1.size();i++)
        {
            temp1.next = new ListNode(l1.get(i));
            temp1 = temp1.next;
        }
        return head1;
    }
}