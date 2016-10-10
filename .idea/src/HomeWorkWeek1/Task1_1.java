package HomeWorkWeek1;;
import java.util.Scanner;
/**
 * Created by Вадим on 03.10.2016.
 */
public class Task1_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter time");
        int time = sc.nextInt();
        if (time >=9 && time <=18) {
            System.out.println("Я на работе");
        }
        else if (time <9 || time > 18){
            System.out.println("Я отдыхаю");
        }
    }
}
