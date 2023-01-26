import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person mike = new Person();

        mike.name = "Mike";
        mike.nationality = "Poland";
        mike.dateOfBrith = "28.10.1992";
        mike.passport = new String[] { mike.name, mike.nationality, mike.dateOfBrith };
        mike.seatNumber = 5;

        System.out.println(mike.name);
        System.out.println(mike.nationality);
        System.out.println(mike.dateOfBrith);
        System.out.println(Arrays.toString(mike.passport));
        System.out.println(mike.seatNumber);
    }
}
