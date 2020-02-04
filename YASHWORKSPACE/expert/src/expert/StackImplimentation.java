package expert;

/*Stack implementation 
   Stack is a linear data structure
   in Stack first IN is Last OUT
   Eg : in hotel there is a bunch of plates. water remove plate of top. he can not remove plate which is at bottom
   it means first inserted plate is remove last. And last inserted plate is remove very first.
  
   in Stack there is TOP
   in Stack there is stack capacity
   store Stack element in array
*/

public class StackImplimentation {

    int capacity=5; // Stack size
    int stackArr[]=new int[capacity];
	int top=-1;
	static int a;
	
	//isEmpty method is checking stack is empty or not
	boolean isEmpty() {
		if(top == -1 )
			return true;
		return false;
	}
	
	//full method is checking stack is full or not
	boolean full() {
		if(capacity-1 == top)
			return true;
		return false;
	}
	
	void push(int element) {
		if(full()) 
			System.out.println("Stack is overtflow, Its Full");
		else {
			System.out.println("Successfully inserted " + element);
			stackArr[++top]=element;
		}
	}
	
	void pop() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			System.out.println("Pop element : " +stackArr[top--]);
		}
	}	
	
	public static void main(String[] args) {
		StackImplimentation st = new StackImplimentation();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(2);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}
}
