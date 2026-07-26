class Solution {
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if (head == null) {
            if (K == 1)
                return new ListNode(X);
            else
                return head;
        }
        if (K == 1)
            return new ListNode(X, head);
        ListNode temp = head;
        int count = 1;
        while (temp != null) {
            if (count == K - 1)
                break;
            temp = temp.next;
            count++;
        }
        ListNode add = new ListNode(X);
        add.next = temp.next;
        temp.next = add;
        return head;
    }
}