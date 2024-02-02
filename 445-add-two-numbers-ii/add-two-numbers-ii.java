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
        ListNode n1 = reverseList(l1);
        ListNode n2 = reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(n1!=null || n2!=null){
            int sum = 0;
            sum = sum + carry;
            if(n1!=null){
                sum = sum + n1.val;
                n1= n1.next;
            }

            if(n2!=null){
                sum = sum + n2.val;
                n2 = n2.next;
            }

            carry = sum/10;
            sum = sum%10;

        
            ListNode node = new ListNode(sum);
            temp.next = node;
            temp = temp.next;

        }
        if(carry ==1){
            ListNode node = new ListNode(1);
            temp.next = node;
            // temp = temp.next;
        }
        // return dummy.next;
        ListNode n3 = reverseList(dummy.next);
        return n3;

    }

      public ListNode reverseList(ListNode head) {
        ListNode pres = head;
        ListNode prev = null;
      
        
   
        while(pres!=null){
            ListNode nxt = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nxt;
            
           
            // tail= tail.next;
        }
        // head = prev;

        return prev;
    }
}