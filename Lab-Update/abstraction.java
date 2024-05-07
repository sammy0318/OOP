abstract class math {
    abstract int add(int a,int b);
    abstract int multi(int a,int b);
}

class B extends math {
    int add(int a,int b) {
        return a+b;
    }
    int multi(int a,int b) {
        return a*b;
    }
}
public class abstraction {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.add(10,20));
        System.out.println(obj.multi(10,20));
    }    
}