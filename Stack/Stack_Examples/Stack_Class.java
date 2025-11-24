package Stack_Examples;

public class Stack_Class
{
    int tos,MaxSize,stack[];
    void create_stack(int size)
    {
        tos=-1;
        MaxSize=size;
        stack=new int[MaxSize];
    }
    //push(e):Accepts element and push it onto the top of the stack.
    void push(int element)
    {
        stack[++tos]=element;
        //tos++
        //stack[tos]=element;
    }
    //isfull():Returns true if stack is full.
    boolean isfull()
    {
        return(tos==MaxSize-1);
    }
    //pop removes and returns element at top of stack
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
        //return(stack[tos--]);
    }
    boolean isempty()
    {
        return(tos==-1);
    }
    //peek():Only returns element on top does not remove.
    int peek()
    {
        return(stack[tos]);
    }
    //Should be performed in Li Fo manner, last in first out from top to bottom.
    void print_stack()
    {
        for(int i=tos;i>=0;i--)
        {
            System.out.println(stack[i]);
        }


    }


}
