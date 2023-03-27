//solution : https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/3343944/easy-java-solution-0ms-4-lines-of-code/
public class problem83 {
    public static void main(String[] args){

    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val; this.next=next;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        while (head != null && head.next != null){
            if (head.val == head.next.val){
                head.next=head.next.next; //better lol
            }
            head=head.next;
        }
        return head;
    }
}
