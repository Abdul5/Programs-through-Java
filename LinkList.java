import java.util.*;
public class LinkList {
	public static void main(String args[]) {
		Linked li = new Linked();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			li.addNode(sc.nextInt());
		}
		int toRemove = sc.nextInt();
        li.remove(toRemove);
		li.PrintList();
	}

}
class Node { //creating node
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}
class Linked {
	Node head;
	void addNode(int data) {    //add nodes
		Node NewNode = new Node(data);
		if(head == null) {
			head = NewNode;
			return;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = NewNode;
		}
	}
	void remove(int toRemove){     //delete nodes
		if(head == null)return;
		if(toRemove == 0){
			head = head.next;
			return;
		}
		int ind = 0;
		Node tmp = head;
		while(ind + 1 != toRemove){
			ind++;
			tmp = tmp.next;
		}
		tmp.next = tmp.next.next;
    }

	void PrintList() {    //print nodes
		Node temp = head;
		while(temp != null) {
			//System.out.println(temp+" "+temp.data+" "+temp.next);
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
