class Variable {
    // Class variable
    static int classVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    public void method() {
        // Local variable
        int localVariable = 30;

        System.out.println("Class variable: " + classVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Local variable: " + localVariable);
    }

}

public class VariableTypes {
    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.method();
    }
}