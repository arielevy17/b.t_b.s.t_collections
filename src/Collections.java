import java.util.*;

public class Collections {
    public static void main(String[] args) {

        //    רשימה מקושרת
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("ddff");
        linkedList.add("2");
        linkedList.add("jjj");
        //linkedList.remove("2");
        System.out.println("---------------------------");


        //    איטרטור
        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            String x = iterator.next();
          //  iterator.remove();
        }
        System.out.println(linkedList);
        System.out.println("---------------------------");

        //    מערך דינמי
        ArrayList  arrayList=new ArrayList<>();
        int sd=1;

        arrayList.add("f");
        arrayList.add(3);
        arrayList.add("eeeee");
        System.out.println(arrayList);
        arrayList.remove("f");
        arrayList.remove("sdfghjkjhgfd");
        System.out.println(arrayList);
        System.out.println("---------------------------");

        //    קבוצה
        HashSet set = new HashSet<>();
        set.add(65);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(2);
        set.add(3);
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            int z= iterator1.next();
            int e=iterator1.next();
            System.out.println(z);
            try {
                if (z> e){
                    System.out.println("z bigger");
                } else {
                    System.out.println("next bigger");
                }
            } catch (Exception ex){
                System.out.println("have not next next");
            }
        }
        System.out.println("_____!!_____");
        System.out.println(set.contains(655));


        System.out.println(set);
        System.out.println("---------------------------");

        //    תור
        Queue<String> queue = linkedList;
        System.out.println(queue);
        queue.add("arie");
        queue.poll();
        queue.peek();
        System.out.println(queue);

        System.out.println("---------------------------");
        //    מפות: שלושה סוגים:

    Map <Integer,String> hashMap= new HashMap<>();
    hashMap.put(4,"d");
    hashMap.put(4,"e");
    hashMap.put(3,"c");
    hashMap.put(1,"a");
        System.out.println(hashMap);
        hashMap.replace(4,"d");
        String delete="c";
        for (String x: hashMap.values()){
            if (x.equals(delete)){
                System.out.println("exist");
            }
        }
        try {

            System.out.println("---------------------------");
            Iterator<String> iterator2 = hashMap.values().iterator();
            while (iterator2.hasNext()) {
                String x = iterator2.next();
                if (x.equals(delete)) {
                    iterator2.remove();
                    System.out.println(x);
                    System.out.println("deleted!!");
                }
            }
            System.out.println(hashMap);

            System.out.println("---------------------------");
            Map<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(4, "d");
            treeMap.put(4, "b");
            treeMap.put(3, "c");
            treeMap.put(1, "a");
            System.out.println(treeMap);
            System.out.println("---------------------------");

            Map linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(4, "d");
            linkedHashMap.put(4, "b");
            linkedHashMap.put("fff", 54);
            linkedHashMap.put(1, "a");
            System.out.println(linkedHashMap);
            Iterator<Integer> iterator21 = linkedHashMap.keySet().iterator();
            while (iterator21.hasNext()) {
                int k = iterator21.next();
                System.out.println(k);
            }
            System.out.println("---------------------------");
        } catch (Exception e){
            System.out.println("לא מעניין כרגע");
        }
        //       מחסנית
    Stack stack = new Stack<>();
    stack.push("sdfg");
    stack.push(32);
        System.out.println(stack);
       System.out.println( stack.contains(32));

    }

}
