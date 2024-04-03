import java.util.Scanner;

class BinConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in decimal: ");
        int num = sc.nextInt();
        String res = "";
         
        while (num > 0) {
            res += num % 2;
            num /= 2;

        }

        System.out.println("The number in binary is: " + res);
    }    
}
