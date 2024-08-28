package PRODIGY_SD_01;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char originalUnit = scanner.next().toUpperCase().charAt(0);

        switch (originalUnit) {
            case 'C':
                convertFromCelsius(temperature);
                break;
            case 'F':
                convertFromFahrenheit(temperature);
                break;
            case 'K':
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
        }

        scanner.close();
    }

    private static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Celsius: %.2f°C%n", celsius);
        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Kelvin: %.2fK%n", kelvin);
    }

    private static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Celsius: %.2f°C%n", celsius);
        System.out.printf("Kelvin: %.2fK%n", kelvin);
    }

    private static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Kelvin: %.2fK%n", kelvin);
        System.out.printf("Celsius: %.2f°C%n", celsius);
        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
    }
}
