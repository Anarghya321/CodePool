public class Dequeue {
	
	int front,rear;
	int dq[];
	
	Dequeue() {
		dq=new int[50];
		front=rear=-1;
	}
	
	void insertFront(int ele) {
		if(front==0) {
			System.out.println("Dequeue Overflow Front");
			return;
		}
		if(front==-1 && rear==-1) {
			front=rear=0;
		}
		else {
			front=front+1;
		}
		dq[front]=ele;
	}
	
	int deleteRear() {
		if(rear==-1) {
			System.out.println("Dequeue Underflow Rear");
			return -9999;
		}
		int val=dq[rear];
		if(rear==front) {
			rear=front=-1;
		}
		else {
			rear=rear-1;
		}
		return val;
	}
	
	void insertRear(int ele) {
		if(rear==49) {
			System.out.println("Dequeue Overflow Rear");
			return;
		}
		if(rear==-1 && front==-1) {
			front=rear=0;
		}
		else {
			rear=rear+1;
		}
		dq[rear]=ele;
	}
	
	int deleteFront() {
		if(front==-1) {
			System.out.println("Dequeue Underflow Front");
			return -9999;
		}
		int val=dq[front];
		if(front==rear) {
			rear=front=-1;
		}
		else {
			front=front+1;
		}
		return val;
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(dq[i]+"|");
		}
	}
	
}