package N;

public class N {
    public static String[] combine(String [] ... arr) {
        int length = 0;
        for (String[] new_arr: arr) {
            length += new_arr.length;
        }

        int count = 0;
        String [] strings = new String[length];

        for (String[] value : arr) {
            for (String s : value) {
                strings[count++] = s;
            }
        }
        return strings;
    }

    public static void showArray(String []arr) {
        System.out.print("{");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        String[][] S = {{"Mnogo", "bukav"}, {"chitat"}, {"ne", "hochetcya", "bukavi"}};
        String[] s = combine(S);
        showArray(s);
    }
}
