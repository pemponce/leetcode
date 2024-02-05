public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(5))))));
        System.out.println("Input: ");
        head1 = solution.deleteDuplicates(head1);
        System.out.println("Output: ");
        System.out.println(head1);
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {


        ListNode current = head;

        while(current!=null && current.next!=null) {
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}