class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        
        // Traverse through the linked list
        while (curr != null && curr.next != null) {
            // If the current node's value equals the next node's value, skip the next node
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                // Otherwise, move to the next distinct node
                curr = curr.next;
            }
        }
        
        return head;
    }
}
