import java.util.*;
public class CollectionPractice {
    public static void main(String[] args) {
        int[] arr={88,99,1,1,1,2,2,3,3,4,0};
        //linkedhash allows one null - maintains insertion order- unique values
        LinkedHashSet<Integer> linkedHash = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            linkedHash.add(arr[i]);//adding into set using add() method

        }

        System.out.println(linkedHash);//prints all elements from set
        linkedHash.remove(1);//removes particular element
        System.out.println(linkedHash);
        System.out.println(linkedHash.size());
        System.out.println(linkedHash.isEmpty());
        System.out.println(linkedHash.hashCode());
        System.out.println(linkedHash.contains(88));

        //hashset return elements in random order
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);//adding into set using add() method

        }

        System.out.println(set);
    }
}
