import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND = 0.4535923;
    final double METERS_PER_INCH = 0.0254;

    System.out.println("Enter weight in pounds: ");
    double weight = input.nextDouble();
    System.out.println("Enter height in inches");
    double height = input.nextDouble();

    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeter = height * METERS_PER_INCH;

    //double bmi = weightInKilograms / (heightInMeter * heightInMeter);
    double bmi = weightInKilograms / Math.pow(heightInMeter , 2);
    System.out.println("Your bmi is " + bmi);

    if (bmi < 16)
    System.out.println("Your are seriously underweight");
    else if (bmi < 18)
    System.out.println("Your are underweight");
    else if (bmi < 24)
    System.out.println("Your are normal weigth");
    else if (bmi < 29)
    System.out.println("Your are overweight");
    else if (bmi < 35)
    System.out.println("Your are seriously overweight");
    else
    System.out.println("Your are gravely overweight");

  }
}
