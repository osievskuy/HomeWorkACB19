package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_4 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        Double number = sc.nextDouble();

        if (number >= 0 && number <= 1){
            System.out.println("number in a range from 0 to 1");
        }
        else {
            System.out.println("number not in a range from 0 to 1");
        }
    }
}
