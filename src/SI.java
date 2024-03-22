import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount:");
        int P = input.nextInt();
        System.out.print("Enter Rate of interest:");
        int R = input.nextInt();
        System.out.print("Enter Time in years:");
        int T = input.nextInt();
        int Simple_Interest = (P*R*T)/100;
        System.out.print("Simple interest is " + Simple_Interest);
        input.close();
    }
}
