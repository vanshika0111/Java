import java.util.*;

public class Sorting {
    static HashMap m = new HashMap();

    public static void sortMap() {
        ArrayList sortKeys = new ArrayList<>(m.keySet());
        Collections.sort(sortKeys);
        for (Integer x : sortKeys)
            System.out.println("Key = " + x + ", Value = " + m.get(x));
    }

    public static String sortString(String input) {
        char Array[] = inputString.toCharArray();
        Arrays.sort(Array);
        return new String(Array);
    }

    public static void main(String[] args) {
        int[] arr = { 54, 9, 7, 1, 0 };
        ArrayList a = new ArrayList();
        String input = "Vanshika";
        String output = sortString(input);
        Integer[] digits = new Integer[] { 12, 89, 0, 5, 7 };
        List digitList = Arrays.asList(digits);
        HashSet set = new HashSet<>();

        // array
        Arrays.sort(arr);
        System.out.println("Array: " + Arrays.toString(arr));

        // ArrayList
        a.add("J");
        a.add("A");
        a.add("V");
        a.add("A");
        Collections.sort(a);
        System.out.println("ArrayList: " + a);

        // String
        System.out.println("String: " + output);

        // List
        Collections.sort(digitList);
        System.out.println("List: " + digitList);

        // map
        m.put(7, "Seven");
        m.put(9, "Nine");
        m.put(1, "One");
        sortMap();

        // Set
        set.add("O");
        set.add("K");
        set.add("A");
        set.add("Y");
        // sort using list
        ArrayList list = new ArrayList<>();
        Collections.sort(list);
        System.out.println("Set: " + list);
    }
}
