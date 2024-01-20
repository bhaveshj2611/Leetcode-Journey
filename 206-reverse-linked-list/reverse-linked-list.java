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