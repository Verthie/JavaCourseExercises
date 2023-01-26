public class TypeConversion {

    public static void main(String[] args) {

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); // casting purchaseBlocksOfCheese to a double

        double salary = 5423.94;
        int roundedSalary = (int)salary; // casting salary to an int 5423.94 => 5423
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);


    }

}
