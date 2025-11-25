public class QueueClass {

    int rear,front,MaxSize,queue[];
    void create_queue(int size)
    {
        rear=-1;
        front=0;
        MaxSize=size;
        queue=new int[MaxSize];
    }
    //enqueue(e) : Accepts element and inserts on queue at rear end (rear++)
    void enqueue(int element)
    {
        queue [++rear]=element;
        //rear++
        //queue[rear]=element;
    }
    //isfull():Returns true if queue is full.
    boolean isfull()
    {
        return(rear==MaxSize);
    }
    //dequeue removes and returns element at front
    int dequeue()
    {
//        int temp=queue[rear];
//        rear--;
//        return(temp);
        return(queue[front++]);
    }
    boolean isempty()
    {
        return(front>rear);
    }

    //Should be performed in Fi Fo manner, last in first out from top to bottom.
    void print_queue()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }


    }
}
