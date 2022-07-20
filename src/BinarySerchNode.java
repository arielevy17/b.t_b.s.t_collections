public class BinarySerchNode extends BinaryNode {

    public BinarySerchNode(Comparable o){
        super(o);
    }

    public void  insert(Comparable o){  //  הכנסת איבר לעץ חיפוש בינארי
       try {
           int ans = o.compareTo(getData());
        if(ans<0){
            if (getLeft()==null){
                setLeft(new BinarySerchNode(o));
            }
            else {
                getLeft().insert(o);
            }

        }
        else {
            if (getRight()==null){
                setRight(new BinarySerchNode(o));
            }
            else{
                getRight().insert(o);
            }
        }
       }catch (Exception e){
           System.out.println("null object cant be compare!");
       }
        }

        public boolean serch(Comparable o){ // חיפוש איבר
        boolean ans=false;
            if (o.compareTo(getData()) == 0) {
                ans = true;
            } else if (o.compareTo(getData()) < 0) {
                ans = (getLeft() != null && getLeft().serch(o));
            } else {
                ans = (getRight() != null && getRight().serch(o));
            }
        return ans;
        }

        // איבר מינימלי
        public Object min(){
        BinaryNode currentNode=this;
        while (currentNode.getLeft() != null){
            currentNode=currentNode.getLeft();
        }
        return currentNode.getData();
        }

        //מחיקת איבר
        public BinarySerchNode remuve(Comparable o){  // לא עובד
        try {
            if (o.compareTo(getData())<0){
                if (getLeft() != null){
                    setLeft(((BinarySerchNode)getLeft()).remuve(o));
                }
            }
            else if (o.compareTo(getData())>0){
                if (getRight() != null){
                    setRight(((BinarySerchNode)getRight()).remuve(o));
                }
            }
            else {
                if (getLeft()==null || getRight()==null){
                    if (getLeft()==null) {
                        setLeft((BinarySerchNode) getRight());
                    }
                    else {
                        setRight((BinarySerchNode)getLeft());
                    }
                }
                else {
                    setData(((BinarySerchNode)getRight()).min());
                    setRight(((BinarySerchNode)getRight()).remuve((Comparable)getData()));
                }
            }
        } catch (Exception e){
            System.out.println("cant compare this objects");
        }
        return this;
        }


}
