import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side1, side2, side3;
        double perimeter;
        double rounds;

        System.out.print("Enter side1 of triangle (in meters): ");
        side1 = sc.nextDouble();

        System.out.print("Enter side2 of triangle (in meters): ");
        side2 = sc.nextDouble();

        System.out.print("Enter side3 of triangle (in meters): ");
        side3 = sc.nextDouble();

        perimeter = side1 + side2 + side3;

        rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");

        sc.close();
    }
}