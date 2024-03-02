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

        if(head == null || head.next == null){
            return null;
        }

        
        ListNode fast = head;
        ListNode slow = head;
        int length=0;
       while(fast!=null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           
           if(fast == slow){
               
               ListNode temp = slow;
               
               do{
                   length++;
                   temp = temp.next;
               }
               while(temp != slow);
            break;
           }
       }

       if(length == 0){
           return null;
       }


       ListNode first = head;
       while(first != slow){
           first = first.next;
           slow = slow.next;
       }

        return first;
    }
}