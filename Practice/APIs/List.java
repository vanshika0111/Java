import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        LinkedList l = new LinkedList();
        LinkedHashMap lh = new LinkedHashMap<>();
        TreeMap t = new TreeMap<>();
        HashSet h = new HashSet<>();
        Iterator i = set.Iterator();

        a.add("A");
        a.add("B");
        System.out.println("Contents of a: " + a);

        l.add("C");
        l.add("D");
        System.out.println("Contents of l: " + l);

        lh.put(100, "E");
        lh.put(null, "F");
        lh.entrySet().stream().forEach((m) -> {
            System.out.println(m.getKey() + " " + m.getValue());
        });

        t.put("G", new Double(34.67));
        t.put("H", new Double(78.67));
        Set set = t.entrySet();
        while (i.hasNext()) {
            Map.Entry me = (MapEntry).iNext();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        h.add("I");
        h.add("J");
        System.out.println("Contents of h: " + h);
    }
}