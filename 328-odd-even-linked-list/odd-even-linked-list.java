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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode headNew = dummy;
        ListNode temp = head;
        while(temp.next!=null && temp.next.next!=null){
            ListNode node = new ListNode(temp.next.next.val);
            dummy.next = node;
            dummy = dummy.next;
            temp = temp.next.next;
        }
        ListNode even = new ListNode(head.next.val);
         temp = head.next;
        dummy.next = even;
        dummy = dummy.next;
        while(temp.next!=null && temp.next.next!=null){
            ListNode node = new ListNode(temp.next.next.val);
            dummy.next = node;
            dummy = dummy.next;
            temp = temp.next.next;
        }
        return headNew;
    }
}