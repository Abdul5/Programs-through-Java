import java.util.Stack;
public class Stack_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		st.push(40);
		st.push(50);
		st.pop();
		System.out.println(st.peek());
		
		while (st.size() != 0) {
            System.out.println("popped -> " + st.pop());
        }
		System.out.println(st.size());

	}

}
