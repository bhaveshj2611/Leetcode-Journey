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
    Stack<ListNode> st = new Stack<>();
    
    ListNode temp = head;
    while(temp!=null){
        st.push(temp);
        temp = temp.next;
    }

    // ListNode mid = middle(head);
    // ListNode head2 = mid.next;
    while(!st.isEmpty() && head != null){
        if(st.pop().val!=head.val){
            return false;
        }
        else{
            head = head.next;
        }
    }
    return true;
    
    // if(head == null || head.next ==null){
    //     return true;
    // }

    // ListNode mid = middle(head);
    // ListNode revHead = reverseList(mid);
    // // mid.next = null;


    // while(head!=null && revHead !=null){
    //     if(head.val != revHead.val){
    //         return false;
    //     }
    //     head = head.next;
    //     revHead = revHead.next;
    // }
    // return true;

}

//  public ListNode middle(ListNode head){
//      ListNode fast = head;
//      ListNode slow = head;
//      while(fast!=null && fast.next !=null){
//          fast = fast.next.next;
//          slow = slow.next;
//      }
//      return slow;
//  }

//  public ListNode reverseList(ListNode head){
//      ListNode prev = null;
//      ListNode pres = head;
//      while(pres!=null){
//          ListNode next = pres.next;
//          pres.next = prev;
//          prev = pres;
//          pres = next;
//      }
//      return prev;
//  }
}