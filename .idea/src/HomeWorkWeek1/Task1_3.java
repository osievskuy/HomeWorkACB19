package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_3 {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        if (number%7==0){
            System.out.println("Result " + number * 2);
        }
        else {
            System.out.println("A number is not divided by 7");
        }
    }
}