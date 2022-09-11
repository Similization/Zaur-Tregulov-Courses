package Loops;

public class Loops {
    public static void time() {
        HRS:
        for (int hrs = 0; hrs <= 6; hrs++) {
            MIN:
            for (int min = 0; min <= 59; min++) {
                if (hrs > 1 && min % 10 == 7) {
                    break HRS;
                }

                SEC:
                for (int sec = 0; sec <= 59; sec++) {
                    if (sec * hrs > min) {
                        continue MIN;
                    }
                    System.out.printf("%02d:%02d:%02d\n", hrs, min, sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
