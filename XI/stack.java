class stack
{
    int st[]=new int[100];
    int top;
    stack()
    {
        top=-1;
    }
    void push(int ele)
    {
        if(top==99)
        {
            System.out.println("Stack Overflow/Terminating");
            return;
        }
        st[++top]=ele;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -9999;
        }
        int val=st[top--];
        return val;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        System.out.println(st[i]);
    }
}