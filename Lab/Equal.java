import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else {
            
            System.out.println("Not Equal");
        }
    }
}
