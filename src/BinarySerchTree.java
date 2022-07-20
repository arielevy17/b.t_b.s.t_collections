public class BinarySerchTree {

    private BinarySerchNode root;

    public BinarySerchTree(){
        root=null;
    }

    public void insert(Comparable o){ //  הוספה
        if (root != null){
            root.insert(o);
        }
        else {
            root = new BinarySerchNode(o);
        }
    }

    public boolean serch(Comparable o) { // חיפוש
        boolean ans = false;
        try {
            if (o.compareTo(root.getData())==0) {
                ans = true;
            } else {
                ans = root.serch(o);
            }
        } catch (Exception e) {
            System.out.println("cant compare between this objects");
        }
        return ans;
    }

    // איבר מינימלי
      public Object min(){
        Object ans =root;
        if (root !=null){
            ans=root.min();
        }
        return ans;
      }

      // מחיקת איבר
     public BinarySerchNode remuve(Comparable o){ // לא עובד
        BinarySerchNode ans=null;
        if (root != null){
            ans=root.remuve(o);
        }
        return ans;
     }

}
