//CREDIT : https://youtu.be/XIdigk956u0
public class problem21{
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
    public static void main(String[] args){

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        ListNode dummy = new ListNode();
        ListNode tail=dummy;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next=list1.val;
                list1=list1.next;
            }
            else{
                tail.next=list2.val;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if (list1 != null){
            tail.next=list1;
        }else {
            tail.next=list2;
        }
        //since dummy is initialized with the defautl values;
        return dummy.next;
    }
}