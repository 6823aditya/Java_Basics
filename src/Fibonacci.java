import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("the number of elements: ");
        int n = input.nextInt();
        int i,FirstTerm=0,SecondTerm=1;
        for(i=0;i<n;i++){
            System.out.print(FirstTerm +" ");

        int nextTerm = FirstTerm+SecondTerm;
        FirstTerm=SecondTerm;
        SecondTerm=nextTerm;}


    }
}
