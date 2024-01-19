/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(length>0){
            second = second.next;
            length--;
        }

        while(first!=second){
            second = second.next;
            first = first.next;
        }
        return second;
    }

    public int lengthCycle(ListNode head){
         ListNode fast = head;
        ListNode slow = head;
        // int length = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp= slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp!=slow);
                System.out.println(length);
                return length;
            }
        }
        // System.out.println(length);
        return 0;
    }
}