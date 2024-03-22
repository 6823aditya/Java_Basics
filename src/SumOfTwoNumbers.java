import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number 1:");
        int num1 = input.nextInt();
        System.out.print("enter number 2:");
        int num2 = input.nextInt();
        int Sum = num2 + num1;
        System.out.print(Sum);
    }
}
