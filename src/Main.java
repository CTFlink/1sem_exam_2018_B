/**
 * Dette er main klasssen der starter programmet.
 */
public class Main {

    //et par strings der ikke kan ændres og som kan bruges uden for klassen
    public static final String SOFTWARE_VERSION = "0.1.0";
    public static final String MEDIA_MAPPE = "media/";


    /**
     * selve main metoden.
     * indtil videre kører den kun test metoden i Test klassen.
     * @param args
     */
    public static void main(String[] args) {

        Test.test();

    }
}

