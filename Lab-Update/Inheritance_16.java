class Base{
    int X;
    Base(){
        System.out.println("Base class constructor");
    }
    Base(int a){
        System.out.println("Overloaded Base class constructor with a = "+a);
    }
    public int getX(){return X;}
    public void setX(int x){
        this.X = x;
    }
}

class Derived extends Base{
     Derived(){
        super(5);
        System.out.println("Derived class constructor");
    }
    int Y;

    public int getY(){return Y;}
    public void setY(int y){
        this.Y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(23);
        d.setY(56);
       int x = d.getX();
       int y =  d.getY();
        System.out.println("x = "+ x );
        System.out.println("y = "+ y );
        
    }
}
