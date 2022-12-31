import java.util.Scanner;

//class Nod {
//	int data;
//	Nod next;
//	Nod(int data) {
//		this.data = data;
//		next = null;
//	}
//}
//public class LLDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Nod n1 = new Nod(10);
//		Nod n2 = new Nod(20);
//		System.out.println(n1.data);
//		n1.next = n2;
//		System.out.println(n1.next);
//		System.out.println(n2.data);
//		System.out.println(n2);
//
//	}
//
//}


class Nod<T> {
	T data;
	Nod next;
	Nod(T data) {
		this.data = data;
		next = null;
	}
}
public class LLDemo {
//	public static Nod<Integer> Input() {   // this method is written in O(n2)
//		Nod<Integer> head = null;
//		Scanner sc = new Scanner(System.in);
//		int data = sc.nextInt();
//		while(data != -1) {
//			Nod<Integer> newN = new Nod<>(data);
//			if(head == null) {
//				head = newN;
//			}
//			else {
//				Nod<Integer> temp = head;
//				while(temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newN;
//			}
//			data = sc.nextInt();
//		}
//		return head;
//	}
	
	public static Nod<Integer> Input() {  //this method written in O(n) time complexity
		Nod<Integer> head = null,tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Nod<Integer> newN = new Nod<>(data);
			if(head == null) {
				head = newN;
				tail = newN;
			}
			else {
				tail.next = newN;
				tail = newN;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static Nod<Integer> Insert(Nod<Integer> head,int data,int pos) {
		Nod<Integer> newN = new Nod<>(data);
		if(pos == 0) {
			newN.next = head;
			return newN;
		}
		int i = 0;
		Nod<Integer> temp = head;
		while(i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newN.next = temp.next;
		temp.next = newN;
		return head;
	}
	public static void Del(int pos) {
		Nod<Integer> head = null;
		Nod<Integer> temp = head,prev = null;
		if(temp != null && temp.data == pos) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != pos) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) {
			return;
		}
		prev.next = temp.next;
		
	}
	
	public static void print(Nod<Integer> head) {
		Nod temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//LLDemo ob = new LLDemo();
//		Nod<Integer> n1 = new Nod<Integer>(10);
//		Nod<Integer> n2 = new Nod<Integer>(20);
//		Nod<Integer> n3 = new Nod<Integer>(30);
//		Nod<Integer> n4 = new Nod<Integer>(40);
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		System.out.println(n1.data+" "+n1.next);
//		System.out.println(n2.data+" "+n2+" "+n2.next);
		
//		Scanner sc = new Scanner(System.in);
//		int data = sc.nextInt();
//		int pos = sc.nextInt();
		
		Nod<Integer> head = Input();
		head = Insert(head,80,1);
		Del(2);
		print(head);
	}

}
