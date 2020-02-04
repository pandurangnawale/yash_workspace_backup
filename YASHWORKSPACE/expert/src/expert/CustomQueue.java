package expert;

public class CustomQueue {

	int capacity = 5;
	int queue[] = new int[capacity];
	int front = 0;
	int rear = 0;

	public void insert(int ele) {
		if (isFull())
			System.out.println("Queue is full");
		else
			queue[rear++] = ele;

	}
	public void delete()
	{
		for(int i=0;i<rear-1;i++)
		{
			queue[i]=queue[i+1];
		}
		rear--;
	}
	public boolean isFull() {
		if (capacity == rear)
			return true;
		else
			return false;
	}
    public boolean isEmpty()
    {
    	if(front==rear)
    		return true;
    	else
    	return false;
    }
	public void show() {
		for (int i = 0; i <rear; i++) {
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue c = new CustomQueue();
		c.insert(10);
		c.insert(20);
		c.insert(30);
		c.insert(40);
		c.insert(50);
		c.show();
		c.delete();
		System.out.println("after deletion : ");
		c.show();
		c.insert(100);
		System.out.println("After new insertion");
		c.show();
		c.delete();
		System.out.println("After new deletion");
		c.show();
	}

}
