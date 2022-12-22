import java.util.*;
class Node2
{
    int data;
    Node2 next;
    
    Node2(int x)
    {
        data = x;
        next = null;
    }
}
public class CycleStartElemLinkedList {
	public static void makeLoop(Node2 head, Node2 tail, int x){
        if (x == 0) return;
        
        Node2 curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        Node2 head = new Node2(num);
        Node2 tail = head;
        
        for(int i=0; i<n-1; i++)
        {
            num = sc.nextInt();
            tail.next = new Node2(num);
            tail = tail.next;
        }
        
        int pos = sc.nextInt();
        makeLoop(head, tail, pos);
        
        Solution1 x = new Solution1();
        Node2 y = x.detectLoop(head); 
        if( y == null )
            System.out.println(0);
        else
            System.out.println(y.data);
    }

}
class Solution1 {
    public static Node2 detectLoop(Node2 head){
        //write code herw
		Node2 slow = head, fast = head;
		while(fast != null && fast.next != null){
			 fast = fast.next.next;
			 slow = slow.next;
			 if(slow == fast){
				 fast = head;
				 while(fast != slow){
					 fast  = fast.next;
					 slow = slow.next;
				 }
				 return fast;				 
			 }
		}
		return null;
    }
}
