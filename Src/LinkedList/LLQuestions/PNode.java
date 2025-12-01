package LinkedList.LLQuestions;

public class PNode {
    float c;
    int p;
    PNode ( float c, int p)
    {
        this.c =c;
        this.p = p;
    }
    //Create a print which will print "P" and "C".
    void print()
    {
        System.out.print(c+"X^"+p+" ");
    }

}
