/*
Question : Write a program to print two numbers p and q, find the value of
           p^q using a recursive function.
 */
import java.util.Scanner;
public class Main {
    static int PowerFunction(int number,int PowerDigit){
        if (PowerDigit == 0)return 1;
        return PowerFunction(number, PowerDigit - 1) * number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,powerDigit;
        System.out.println("Enter the number :");
        number = sc.nextInt();
        System.out.println("Enter the power of that number :");
        powerDigit = sc.nextInt();
        System.out.println("Printing the final result of : " + number + "^" + powerDigit);
        System.out.println(PowerFunction(number,powerDigit));
    }
}