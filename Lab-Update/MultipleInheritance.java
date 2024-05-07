class Mul {
    int x=10;
}

class B extends Mul {
    int y=33;
}

class C extends B {
    int z=89;
}
class MultipleInheritance {
    public static void main(String[] args) {
        Mul a=new Mul();
        B b=new B();
        C c=new C();

        System.out.println(c.x+" "+c.y+" "+c.z);
        System.out.println(b.x+" "+b.y);
        System.out.println(a.x);
    }
}