import java.util.Scanner;
import java.lang.Math;

class DecConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int num = sc.nextInt();
        int res = 0;
        int exp = 0;
        
        while (num > 0) {
            res += (num % 10) * (Math.pow(2, exp));
            num /= 10;
            exp ++;
        }

        System.out.println("The number in decimal is: " + res);
    }

}
