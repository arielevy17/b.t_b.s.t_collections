import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinarySerchTree binarySerchTree=new BinarySerchTree();
        //ArrayList list=new ArrayList<>();
        binaryTree.insert("56");
        binaryTree.insert("26");
        binaryTree.insert("66");
        binaryTree.insert("0");
        binaryTree.insert("3");
        binaryTree.insert("4");
        binaryTree.insert(5);

        Comparable <Integer> a=56;
        Comparable <Integer> b=6;
        Comparable <Integer> c=86;
        binarySerchTree.insert(a);
        binarySerchTree.insert(b);
        binarySerchTree.insert(c);
        Comparable <Integer> d=2;
        binarySerchTree.insert(d);


        // System.out.println(binarySerchTree);
        /*System.out.println(binarySerchTree.min());
        System.out.println(binarySerchTree.serch(d));
        System.out.println(binarySerchTree.serch("8"));
       System.out.println(binaryTree);
        System.out.println(binaryTree.high());
        System.out.println(binaryTree.serch(5));
        System.out.println(binaryTree.size());
        binaryTree.scean();
        */

    }
}
