package Arrays;

public class ArrL {
    public static void showArray(double [][]arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j != arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        double [][]arr = {{1, 2}, {3, 4, 5}, {6}};
        showArray(arr);
    }
}
