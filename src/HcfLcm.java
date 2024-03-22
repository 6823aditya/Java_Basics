import java.util.Scanner;
public class HcfLcm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int i=1;
        int hcf = 0;
        for(;i<=num1&&i<=num2;i++){
            if(num1%i==0||num2%i==0){
                hcf = i;
            }
        }
        System.out.println("the hcf for the two number is "+hcf);
        int lcm;
        lcm = (num2*num1)/hcf;
        System.out.println("the lcm for the two number is " + lcm);



    }
}
