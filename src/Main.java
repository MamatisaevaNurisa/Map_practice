import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(122);
        integers.add(3);

        System.out.println(integers);


        Deque<Integer> integers1 = new ArrayDeque<>();
        integers1.add(5);
        integers1.add(10);

        System.out.println(integers1.offerFirst(555));
        integers1.addFirst(4444);
        integers1.addLast(8888);
        integers1.offerLast(345);
        System.out.println(integers1);


        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 100);
        integerMap.put(2, 200);
        for (Map.Entry<Integer, Integer> m : integerMap.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println(integerMap);


        Map<Integer, Integer> integerMap2 = new LinkedHashMap<>();
        integerMap.put(2, 100);
        integerMap.put(3, 200);

        System.out.println(integerMap2.entrySet());
        System.out.println(integerMap2.get(4));
        System.out.println(integerMap2.keySet());



    }
}