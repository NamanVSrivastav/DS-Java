package LinkedList.EMS;
public class Struct {
    ENode root;//instance field ---

    void insert(String a  ,int b ,float sal, char gen){//method non-static we need object of class  to call this method.
        ENode n = new ENode(a,b,sal,gen);
        if(root==null){
            root=n; //transferring of ownership
        }
        else{
            n.next=root;
            root=n;
        }
    }
    //-----------------------------------------------------
    void delete(int id)
    {
        if (root == null)
            System.out.print("\n No Such Employee Found");
        else {
            ENode t = root;//1
            ENode t2 = root;//1
            while (t != null)
            {
                if (id == t.id)
                    break;//stop searching
                t2=t;//1
                t = t.next;//2
            }
            if (t == null)
                System.out.print("\nNo Such Employee Found");
            else//found
            {
                if(t==root)//case left most
                    root=root.next;//del left
                else if(t.next==null)//case 2 right most
                    t2.next=null;//delete right
                else//case 3
                    t2.next=t.next;//bypass
                System.out.print("\nEmployee with ID " + t.id + " deleted");
            }
}
}
//-----------------------------------------------------------------

    void print_list() {
        if (root == null)
            java.lang.System.out.print("\nLinked list empty");
        else {
            ENode t = root;//1
            while (t != null) {
                java.lang.System.out.print(" Employee Name: " + t.name + "\n Employee Id: " + t.id + "\n Employee Salary: " + t.sal + "\n Employee Gender: " + t.gender +"\n");
                t = t.next;//2
            }
        }
    }
    //------------------------------------------------------------
    boolean search_list(int key)
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            ENode t=root;//1
            while(t!=null)
            {
                if(key==t.id)
                    return true;
                t=t.next;//2
            }
        }
        return false;
    }



}




