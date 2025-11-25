package Queue.Circular;

public class CircularQueueClass {

    int rear,front,c,count,MaxSize,queue[];
    void create_queue(int size)
    {
        rear=-1;
        front=0;
        count=0;
        c=0;
        MaxSize=size;
        queue=new int[MaxSize];
    }
    //enqueue(e) : Accepts element and inserts on queue at rear end (rear++)
    void enqueue(int element)
    {
        rear=(rear+1)%MaxSize;
        queue[rear]=element;
        count++;
        //queue [++rear]=element;
        //rear++
        //queue[rear]=element;
    }

    //dequeue removes and returns element at front
    int dequeue()
    {
        front=(front+1)%MaxSize;
        count--;
        return queue[front];

//        int temp=queue[rear];
//        rear--;
//        return(temp);
//            return(queue[front++]);
    }
    //isfull():Returns true if queue is full.
    boolean isfull()
    {
        return(count==MaxSize);
    }
    boolean isempty()
    {
        return(count==0);
    }

    //Should be performed in Fi Fo manner, last in first out from top to bottom.
    void print_queue()
    {
        int i = front;
        for(int c=0;c<count;++c) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % MaxSize;

        }
    }
}

