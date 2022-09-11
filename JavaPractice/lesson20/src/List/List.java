package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
    public static ArrayList<String> abc(String ... strings) {
        ArrayList<String> arr = new ArrayList<>();

        for (String s: strings) {
            if (arr.contains(s)) {
                continue;
            }
            arr.add(s);
        }
        Collections.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> s = abc("Hello", "me", "Hello", "ok", "here", "here");
        System.out.println(s);
    }
}
