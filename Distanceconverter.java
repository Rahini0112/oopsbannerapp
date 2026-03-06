import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distanceInFeet;
        double distanceInYards;
        double distanceInMiles;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = sc.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}