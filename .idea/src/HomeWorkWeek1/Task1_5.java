package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        System.out.println("Enter number");
        int number2 = sc.nextInt();

        if (number > number2) {
            System.out.println("Difference of numbers " + (number - number2));
        }
        else {
            System.out.println("Sum of numbers " + (number + number2));
        }

    }
}
