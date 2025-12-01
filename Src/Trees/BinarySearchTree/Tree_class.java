package Trees.BinarySearchTree;

public class Tree_class {
    Node root;
    void insert(Node r,Node n) {
        if (root == null) {
            root = n;
        }
         else {
            if (n.value < r.value) {
                if (r.left == null)
                    r.left = n;

                else {
                    insert(r.left, n);
                }
            } else {
                if (r.right == null)
                    r.right = n;
                else {

                        insert(r.right, n);
                }
            }
         }
    }
    void inorder(Node r)
    {
        if(r!=null)
        {
            inorder(r.left);
            System.out.print(r.value+",");
            inorder(r.right);
        }
    }

    void Preorder(Node r)
    {
        if(r!=null)
        {
            System.out.print(r.value+",");
            Preorder(r.left);
            Preorder(r.right);
        }
    }
    void Postorder(Node r)
    {
        if(r!=null)
        {
            Postorder(r.left);
            Postorder(r.right);
            System.out.print(r.value+",");

        }

    }
    int count_nodes(Node r)
    {
        if(r==null)
            return 0;
        else
            return 1+count_nodes(r.left)+count_nodes(r.right);//
    }

    int count_leaf(Node r)
    {
//        int count=0 ;
        if (r==null)
            return 0;
        else if (r.left==null && r.right==null)
             return 1;
        return count_nodes(r.left)+count_nodes(r.right);

    }
    //max asked
    int count_height(Node r)
    {
        if (r==null)
            return 0;

        return 1+ Math.max( count_nodes(r.left),count_nodes(r.right));
    }
    boolean search_tree(Node r,int key)
    {
        //searches Key on tree if found returns true as false.
        if(r==null)
            return false;
        else
        {
            if(key==r.value)
                return true;
            if(key<r.value)
                return search_tree(r.left,key);
            else
                return search_tree(r.right,key);

        }
    }




    public static void main(String[] args) {
        Tree_class tree=new Tree_class();
        tree.insert(tree.root,new Node(20));
        tree.insert(tree.root,new Node(5));
        tree.insert(tree.root,new Node(30));
        tree.insert(tree.root,new Node(1));
        tree.insert(tree.root,new Node(5));
        tree.insert(tree.root,new Node(30));
        tree.insert(tree.root,new Node(1));
        tree.insert(tree.root,new Node(20));
        tree.insert(tree.root,new Node(5));
        tree.insert(tree.root,new Node(30));
        tree.insert(tree.root,new Node(1));
        tree.insert(tree.root,new Node(5));
        tree.insert(tree.root,new Node(30));
        tree.insert(tree.root,new Node(1));





        tree.inorder(tree.root);
        System.out.println("-----inorder");
        tree.Preorder(tree.root);
        System.out.println("-----preorder");
        tree.Postorder(tree.root);
        System.out.println("-----postorder");
        System.out.println("no of nodes:"+" "+tree.count_nodes(tree.root) );
        System.out.println("no of leaf:"+" "+tree.count_leaf(tree.root) );
        System.out.println("height of a tree:"+" "+(tree.count_height(tree.root)-1) );
        System.out.print("\n10 is in tree:"+tree.search_tree(tree.root,10));
    }

}

