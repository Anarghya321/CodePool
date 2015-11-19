class queue
{
    int q[]=new int[50];
    int front,rear;
    queue()
    {
        front=rear=-1;
    }
    void insert(int ele)
    {
        if(rear==49)
        {
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1&&rear==-1)
            front=rear=0;
        else
            rear=rear+1;
        q[rear]=ele;
    }
    void delete()
    {
        if(front==-1)
        {
            System.out.println("Queue underflow");
            return;
        }
        int val=q[front];
        if(front==rear)
            rear=front=-1;
        else
            front=front+1;
            System.out.println("deleted value: "+val);
    }

    void display()
    {
        for(int i=front;i<=rear;i++)
            System.out.print(q[i]+"-");
            System.out.println();
    }
}

