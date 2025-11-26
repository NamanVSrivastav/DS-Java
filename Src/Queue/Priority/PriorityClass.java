package Queue.Priority;
import  java.util.Scanner;
import java.util.Arrays;
public class PriorityClass
{
    int rear, front, MaxSize, queue[];

    void create_queue(int size) {
        front = 0;
        rear = -1;
        MaxSize = size;
        queue = new int[MaxSize];
    }

    //enqueue(e):Accepts element inserts it on queue at rear end(rear+1)
    void enqueue(int element) {
        queue[++rear] = element;
        for(int i=front;i<rear;i++)
        {
            for(int j=front;j<rear;j++)
            {
                if(queue[j]<queue[j+1]) {
                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
        }

    }

    //isfull():Returns true if queue is full.
    boolean isfull() {
        return (rear == MaxSize - 1);
    }

    //dequeue removes and returns element at front
    int dequeue() {
        return (queue[front++]);
    }

    boolean isempty() {
        return (front > rear);
    }

    void print_queue()//FIFO manner
    {
        System.out.print("\nQueue has:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "-");
        }
    }
}
