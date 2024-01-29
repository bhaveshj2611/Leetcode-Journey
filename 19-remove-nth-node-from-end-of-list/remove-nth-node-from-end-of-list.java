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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
       
        if(length==n){
            head = head.next;
            return head;
        }
      
        temp = head;
        
        for(int i=0;i<length-n-1;i++){
            temp = temp.next;
        }
        if(temp.next!= null && temp.next.next != null){
            temp.next = temp.next.next;
        }
        else if(temp.next.next == null){
            temp.next = null;
        }
    
        return head;
    }
}