
public class Overloading {
    static void greet() {
        System.out.println("Good Morning bro!");
    }
    static void greet(String a) {
        System.out.println("Good Morning " + a);
    }
    static void greet(String a, String b) {
        System.out.println("Good Morning " + a + " and " + b);
    }
    static void greet(int a) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("You have a unique name :-)");
    }
    public static void main(String[] args) {
        String a = "Friend";
        String b = "Brother";
        greet();
        greet(a);
        greet(a,b);
        greet(45);
    }
}