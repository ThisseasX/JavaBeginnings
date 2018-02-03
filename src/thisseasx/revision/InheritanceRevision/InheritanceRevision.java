package thisseasx.revision.InheritanceRevision;

public class InheritanceRevision {

    public static void main(String[] args) {
        InheritanceB b = new InheritanceB();

        b.test();
        b.test("3.5");
        b.test(3);
        b.test(3.5f);
    }
}
