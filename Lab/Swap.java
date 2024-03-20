import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("First  variable after swap: " + a);
        System.out.println("Second  variable after swap: " + b);
    }    
}
