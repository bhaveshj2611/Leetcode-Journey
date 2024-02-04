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

        ListNode prev = null;
        ListNode pres = head;
        // prev.next = pres;

        // ListNode temp = head;
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
         
         if(nodeBeforeRev != null){
            nodeBeforeRev.next = prev;
            
         }
         else head = prev;
         
         newEnd.next = pres;
         return head;
        
    }

   
}