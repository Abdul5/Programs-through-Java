import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        next = null;
    }
}
class LinkedLists{
    Node1 head;
    void add(int data ){
        Node1 new_node = new Node1(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node1 current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
 static Node1 merge(Node1 head1, Node1 head2){
       // Write your code here
		 if(head1 == null) return head2;
		 if(head2 == null) return head1;

		 Node1 dummy = new Node1(50);
		 Node1 head3 = dummy;

	     while(head1 != null && head2 != null){
			 if(head1.data < head2.data){
				 head3.next = head1;
				 head1 = head1.next;
			 }
			 else{
				 head3.next = head2;
				 head2 = head2.next;
			 }
			 head3 = head3.next;
		 }

		 if(head1 != null){
			 head3.next = head1;
		 }
		 else{
			 head3.next = head2;
		 }
		 return dummy.next;
	     
    }
}
public class MergeTwoSortedLinkedList {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedLists l1= new LinkedLists();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedLists l2 = new LinkedLists();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node1 head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
