import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number1, number2;
        double addition, subtraction, multiplication, division;

        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);

        sc.close();
    }
}