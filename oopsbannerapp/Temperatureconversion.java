import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double celsiusResult;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " 
                           + celsiusResult + " celsius");

        sc.close();
    }
}