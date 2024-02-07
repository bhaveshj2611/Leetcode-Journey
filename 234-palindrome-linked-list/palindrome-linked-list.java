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
    public boolean isPalindrome(ListNode head) {
    
    if(head == null || head.next == null){
        return true;
    }
    ListNode fast = head;
    ListNode slow = head;
     while(fast!=null && fast.next !=null){
         fast = fast.next.next;
         slow = slow.next;
     }
    
    ListNode revHead = reverseList(slow);

    while(head!=null && revHead !=null){
        if(head.val != revHead.val){
            return false;
        }
        head = head.next;
        revHead = revHead.next;
    }
    return true;

}


 public ListNode reverseList(ListNode head){
     ListNode prev = null;
     ListNode pres = head;
     while(pres!=null){
         ListNode next = pres.next;
         pres.next = prev;
         prev = pres;
         pres = next;
     }
     return prev;
 }
}