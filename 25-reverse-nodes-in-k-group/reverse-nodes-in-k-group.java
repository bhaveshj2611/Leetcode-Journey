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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode newHead = head;
        for(int i=0;i<k-1;i++){
            newHead = newHead.next;
        }

        while(current!=null){
            ListNode prev = null;
            ListNode pres = current;

            for(int i=0;i<k && pres!=null;i++){
                
                    ListNode nxt = pres.next;
                
                
                pres.next = prev;
                prev = pres;
                pres = nxt;
                
            }
            ListNode temp = pres;
            // ListNode dummy = pres;
            // int count = 0;
            // for(int i=0;i<k && dummy!=null;i++){
            //     dummy = dummy.next;
            //     count++;
            // }
            // if(count >= k){
                for(int i=0;i<k-1 && temp!=null;i++){
                temp=temp.next;
                }
                if(temp!=null){
                    current.next = temp;
                    current = pres;
                }
                else{
                    current.next = pres;
                    current = pres;
                    // ListNode var = current;
                    while(current!=null){
                        current = current.next;
                    }
                    
                }
                
            // }
            // else{
            //     current.next = temp;
            //     ListNode var = temp;
            //     while(var!=null){
            //         var = var.next;
            //     }
    
            }
            
        
            

        
        return newHead;
    }
}