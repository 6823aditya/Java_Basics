import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = input.next();
        String[] arr = a.split("");
        String Str_rev = "";
        int i;
        i=a.length();
        while(i!=0){
            System.out.println(" "+arr[i-1]);
            Str_rev+=arr[i-1];
            i--;
        }
        if(Str_rev.equals(a) ){
            System.out.print(a+" is a palindrome string");

        }else{
            System.out.println(a+" is not a palindrome string");
        }
        System.out.println(Str_rev);
        System.out.println(a);









    }



}
