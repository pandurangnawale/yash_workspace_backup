package expert;

public class QueueImplimentation {
	
	int size=5;
	int queue[]=new int[size];
	int front=0;
	int rear=0;
	int count=0;
	
	boolean isEmpty() {
		if(count == 0)
			return true;
		return false;
	}
	
	boolean isFull() {
		if(count == size) {
			return true;
		}else {			
		return false;
		}
	}
	
	
	
	void enqueue(int element) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			queue[rear]=element;
			System.out.println(element +" Element inserted index "+ rear);
			//rear++;
			rear = (rear+1)%size;
			count++;
			System.out.println("rear : "+rear);
		}
	}
	
	void dequeue() {
		if(isEmpty())
			System.out.println("Queue is Empty");
		else {
			System.out.println(queue[front] +" Element removed from index "+ front);
			//front++;
			front = ( front + 1 ) % size;
			count--;
			System.out.println("front : "+front);
			System.out.println("rear : "+rear);
			
		}	
	}
	
	void disp() {
		System.out.print("QUEUE : ");
		for(int i=0;i<size;i++) {
			System.out.print(" "+queue[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueImplimentation que = new QueueImplimentation();
		
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.enqueue(6);
		
		que.disp();
		
		que.dequeue();
		que.disp();
		que.dequeue();
		que.disp();
		que.dequeue();
		que.dequeue();
		que.disp();
		que.dequeue();
		que.disp();
		que.dequeue();
		que.disp();
		que.dequeue();		
		que.disp();
		
		
		
		
	}
}
