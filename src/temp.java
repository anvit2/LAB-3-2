import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the temperatue in celcius");
        double Fahrenheit = obj.nextDouble();
        double Celcius = (Fahrenheit - 32) / 1.8;
        System.out.println(Celcius);
    }
}
