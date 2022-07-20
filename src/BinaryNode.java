import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNode {

    private Object data;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(Object data){
        if (data != null) {
            this.data = data;
            left = null;
            right = null;
        }
        else {
            throw new RuntimeException("שונה מnull");
        }
    }

    public void insert (Object toAdd){ // הוספה
            if (Math.random()<0.5){
                if (left== null){
                left=new BinaryNode(toAdd);
            }
            else {
                left.insert(toAdd);
            }
        }
        else {
            if (right==null){
                right=new BinaryNode(toAdd);
            }
            else {
                right.insert(toAdd);
            }
        }
    }

    public int high(){ //  גובה העץ
        int high=0;
        if (left!=null){
           high= left.high()+1;
        }
        if (right!=null){
           high= Math.max(high,right.high()+1);
        }
        return high;
    }

    public boolean serch(Object object){  // חיפוש איבר
        boolean ans=false;
        if (data.equals(object)){
            ans =true;
        }
       else if (left!=null && left.serch(object)){
           ans=true;
        }
       else {
           ans=(right != null && right.serch(object));
        }
        return ans;
    }

    public int size(){  //  מספר הצמתים
        int ans=1;
        if (left !=null){
            ans = ans+ left.size();
        }
        if (right != null){
            ans = ans+ right.size();
        }
        return ans;
    }

    public void scean(Queue q){  //  סריקה לפי רמות (סריקה רוחבית)
        System.out.println(data+" ");
        if (left != null){
            q.add(left);
        }
        if (right != null){
            q.add(right);
        }
        if (!q.isEmpty()){
            ((BinaryNode)q.poll()).scean(q);
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }
}
