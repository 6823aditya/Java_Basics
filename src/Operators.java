import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = input.nextInt();
        System.out.print("Enter num2:");
        int num2 = input.nextInt();
        System.out.print("Enter Operator:");
        String op = input.next();
        if (op.equals("+")){
            System.out.print("The sum is ");
            System.out.print(num1+num2);
        } else if (op.equals("-")) {
            System.out.print("the difference is ");
            System.out.print(num1-num2);
        } else if ("*".equals(op)) {
            System.out.print("the product is ");
            System.out.print(num1*num2);
        } else if (op.equals("/")) {
            System.out.print("the division is ");
            float div;
            div = (float) num1 /num2;
            System.out.print(div);
        }




    }

}
