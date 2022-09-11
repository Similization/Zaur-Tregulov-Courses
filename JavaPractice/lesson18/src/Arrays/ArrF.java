package Arrays;

public class ArrF {
    public static void sortArr(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (arr[min] != arr[i]) {
                int x = arr[min];
                arr[min] = arr[i];
                arr[i] = x;
            }
        }
    }

    public static void showArray(int []arr) {
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
        int []arr = {9, 5, 4, 6, 3, 8};
        showArray(arr);
        sortArr(arr);
        showArray(arr);
    }
}
