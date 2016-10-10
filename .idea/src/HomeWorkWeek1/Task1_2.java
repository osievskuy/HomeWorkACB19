package HomeWorkWeek1;
import java.util.Scanner;
/**
 * Created by Вадим on 10.10.2016.
 */
public class Task1_2 {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first number ");
        int fNumber = sc.nextInt();
        System.out.println ("Enter second number ");
        int sNumber = sc.nextInt();
        System.out.println("Enter third number " );
        int thNumber = sc.nextInt();

        if (fNumber > sNumber && fNumber > thNumber){
            System.out.println("Max number: " + fNumber);
        }
        if  (sNumber > fNumber && sNumber > thNumber){
            System.out.println("Max number: " + sNumber);
        }
        if (thNumber > sNumber && thNumber > fNumber){
            System.out.println("Max number: " + thNumber);
        }

        if (fNumber < sNumber && fNumber < thNumber){
            System.out.println("Min number: " + fNumber);
        }
        if(sNumber < fNumber && sNumber < thNumber){
            System.out.println("Min number: " + sNumber);
        }
        if (thNumber < fNumber && thNumber < sNumber){
            System.out.println("Min number: " + thNumber);
        }
        System.out.println("Thank you. Good byu!!!");

    }//5 3 2
}
