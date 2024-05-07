class Base{
    void m(){
        System.out.println("This is parent class");
    }
}

class Derived extends Base{
     void n(){
        System.out.println("This is child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.m();
        d.n();
        
    }
}
