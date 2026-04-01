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
    public ListNode insertionSortList(ListNode head) {
        List<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp =temp.next;
        }
        Collections.sort(list);
        ListNode head1 = new ListNode(list.get(0));
        ListNode temp2 = head1;
        for( int i =1;i<list.size();i++)
        {
            temp2.next = new ListNode(list.get(i));
            temp2 =  temp2.next;
        }
        return head1;
    }
}