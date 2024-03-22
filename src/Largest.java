import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("the num1 is: ");
        int num1 = input.nextInt();
        System.out.print("the num2 is: ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.print(num1 + " is greater than " + num2);
        } else if (num1<num2) {
            System.out.print(num1 + " is less than " + num2);
        }else{
            System.out.print("both numbers are equal");


    }
    }
}
