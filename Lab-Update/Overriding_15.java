class A{
    public void meth1(){
        System.out.println("This is method 1 of class A");
    }
    public void meth2(){
        System.out.println("This is method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("This is method 2 of class B");
    }
    public void meth3(){
        System.out.println("This is method 3 of class B");
    }
}

public class Overriding_15 {
    public static void main(String[] args) {
        B b = new B();
        b.meth1();
        b.meth2();
        b.meth3();
    }
}
