import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of entries: ");
        int n = input.nextInt();
        int i=0;
        int sum=0;
        while(i<n){
            System.out.print("enter number: ");
            int x = input.nextInt();
            sum+=x;
            i++;
        }
        System.out.print("total sum is "+ sum);
    }
}
