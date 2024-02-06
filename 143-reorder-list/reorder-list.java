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
        ListNode mid = middle(head);
        ListNode head2 = reverseList(mid.next);
        ListNode temp = head;
       
        ListNode temp2 = head2;
        mid.next = null;

        while(temp != null && temp2 != null){
            ListNode l1 = temp.next;
            ListNode l2 = temp2.next;

            temp2.next = l1;
            temp.next = temp2;
            temp=l1;
            temp2=l2;
        }


    }

    public ListNode reverseList(ListNode head){
        ListNode pres = head;
        ListNode prev = null;

        while(pres!=null){
            ListNode nxt = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nxt;
        }

        return prev;
    }

    public ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}