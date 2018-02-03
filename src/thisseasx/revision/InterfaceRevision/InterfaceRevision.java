package thisseasx.revision.InterfaceRevision;

public class InterfaceRevision {

    public static void main(String[] args) {
        MyInterface x = new ClassB();
        x.methodA();
//        x.methodB(); // Nope, MyInterface does not have methodA().
        ((ClassB) x).methodB(); // Only works with casting, ClassB does have methodB().
    }
}
