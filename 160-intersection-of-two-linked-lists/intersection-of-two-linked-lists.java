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
        int l1 = 0;
        ListNode t1 = headA;
        while(t1!=null){
            l1++;
            t1 = t1.next;
        }

         int l2 = 0;
        ListNode t2 = headB;
        while(t2!=null){
            l2++;
            t2 = t2.next;
        }

        int length = Math.abs(l1-l2);

        if(l1<l2){
            for(int i=0;i<length;i++){
                headB = headB.next;
            }
        }
        else{
             for(int i=0;i<length;i++){
                headA = headA.next;
            }
        }
        while(headA!= null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    }