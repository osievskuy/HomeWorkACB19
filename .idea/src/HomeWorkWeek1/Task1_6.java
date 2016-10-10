package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_6 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        System.out.println("Enter number");
        int number2 = sc.nextInt();

        int sum = number + number2;
        if (sum >= 11 && sum <=19){
            System.out.println("Sum of numbers " + sum);
        }
        else {
            System.out.println("Sum of numbers not in a range from 11 to 19");
        }
    }

}
