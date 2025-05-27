import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check if palindrome or not :");
        int num  = input.nextInt();
        int numcopy = num;
        int reverse = 0;
        while(num>0){
            num = num%10;
            reverse = reverse*10+num;
        }
        if(reverse ==numcopy){
            System.out.println("yess the number is palindrome");
        }else{
            System.out.println("Noo,the number is not palindrome");
        }
    }
}
