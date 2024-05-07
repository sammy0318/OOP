class A1 {
    public void method1() {
        System.out.println("This is method 1 of class A");
    }
    public void method2() {
        System.out.println("This is method 2 of class A");
    }
}

class B1 extends A1 {
    @Override
    public void method2() {
        System.out.println("This is method 2 of class B");
    }
    public void method3() {
        System.out.println("This is method 3 of class B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        B1 b = new B1();
        b.method1();
        b.method2();
        b.method3();
    }
}
