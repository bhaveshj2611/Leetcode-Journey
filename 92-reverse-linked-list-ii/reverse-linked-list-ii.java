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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode pres = head;
        dummy.next = head;
    

    
        for(int i=0;i<left-1 && pres!=null;i++){
            prev = pres;
            pres = pres.next;
        }
        ListNode nodeBeforeRev = prev;
        ListNode newEnd = pres;

        for(int i=0;i<right-left+1 && pres!=null;i++){
            ListNode nxt = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nxt;
         }
         
        
         nodeBeforeRev.next = prev;
         newEnd.next = pres;
         return dummy.next;
        
    }

   
}