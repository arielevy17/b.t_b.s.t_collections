import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private BinaryNode root;

    public BinaryTree(){
        root=null;
    }
    public void insert(Object toAdd){ // הכנסה לעץ בינארי היא רנדומלית לאחד הצדדים
        if (root==null){
            root=new BinaryNode(toAdd);
        }
        else {
            root.insert(toAdd);
        }
    }
    public int balance(BinaryNode n){ //  לא תקין
        int ans=1;
        int balance;
        int sumR= balance(n.getRight());
        int sumL=balance(n.getLeft());
        if (n.getLeft()==null||n.getRight()==null){
            balance=Math.abs(sumL-sumR);
            if (balance>1){
                return 0;
            }
        }
        return ans;
    }

    public int high(){  //  גובה עץ
        int high=0;
        if (root != null){
            high=root.high();
        }
        return high;
    }

    public boolean serch(Object object){ //חיפוש איבר
    boolean ans=false;
    if (root.equals(object)){
        ans=true;
    }
    else {
        ans = (root != null && root.serch(object));
    }
    return ans;
    }

    public  int size(){  //  מספר הצמתים
        int ans=0;
        if (root!=null){
            ans = ans + root.size();
        }
        return ans;
    }

    public void scean(){  //  סריקה לפי רמות (סריקה אופקית)
        if (root != null){
            Queue q = new LinkedList();
            root.scean(q);
            System.out.println();
        }

    }


    public BinaryNode getRoot() {
        return root;
    }
}
