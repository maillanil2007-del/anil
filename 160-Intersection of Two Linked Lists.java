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
        // Boundary check: if either list is empty, they cannot intersect
        if (headA == null || headB == null) {
            return null;
        }
        
        // Initialize two pointers for both lists
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        // Traverse through the lists
        while (ptrA != ptrB) {
            // If ptrA reaches the end of listA, redirect it to the head of listB
            ptrA = (ptrA == null) ? headB : ptrA.next;
            
            // If ptrB reaches the end of listB, redirect it to the head of listA
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }
        
        // Either they meet at the intersection node, or they both reach the end (null)
        return ptrA;
    }
}
