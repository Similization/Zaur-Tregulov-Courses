package Tiger;

import java.util.Objects;

public class Tiger {
    void eat(String eda) {
        if (!Objects.equals(eda, "myaso")) {
            throw new NeMyasoException("Tigr ne est" + eda);
        }
        System.out.println("Tigr est myaso");
    }
    void drink(String napitok) throws NeVodaException {
        if (!Objects.equals(napitok, "voda")) {
            throw new NeVodaException("Tigr ne pyet " + napitok);
        }
        System.out.println("Tigr pyet vodu");
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String eda) {
        super(eda);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String napitok) {
        super(napitok);
    }
}

class Lesson {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            }
            catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Eto vneshniy finally block");
        }
    }
}
