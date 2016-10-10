package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        double number = sc.nextDouble();

        System.out.println("Enter number");
        double number2 = sc.nextDouble();

        double part = number / number2;
        if (number % number2 == 0 ){
            System.out.println("true " + part);
        }
        else {
            System.out.println("false " + part);
        }


    }
}
