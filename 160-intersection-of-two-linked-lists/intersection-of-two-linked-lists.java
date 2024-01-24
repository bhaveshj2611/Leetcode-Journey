/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null && headB.next == null){
            if(headA.val == headB.val){
                return headA;
            }
        }
        
        HashSet<ListNode> set = new HashSet<>();
        ListNode t1  = headA;
        ListNode t2 = headB;
        while(t1!=null){
            set.add(t1);
            t1 = t1.next;
        }

        while(t2!=null){
            if(set.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }
    return null;
    }
}