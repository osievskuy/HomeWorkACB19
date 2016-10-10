package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_8 {
    public static void main (String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter number");
        int number2 =sc.nextInt();

        if ((number % 10) == (number2 % 10)){
            System.out.println(number + " " + number2 + " - true" );
        }
        else {
            System.out.println(number + " " + number2 + " - false" );
        }
    }
}
