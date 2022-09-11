package Ravenstvo;

public class Ravenstvo {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() < sb2.length()) {
            return false;
        }
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("hello");
        StringBuilder s3 = new StringBuilder("Hello");

        System.out.println(ravenstvo(new StringBuilder(), new StringBuilder()));
        System.out.println(ravenstvo(s1, s3));
    }
}
