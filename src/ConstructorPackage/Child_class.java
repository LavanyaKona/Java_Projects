package ConstructorPackage;

public class Child_class extends Parent_class {

    public int c1;

    public Child_class(int v1, int c1) {
        super(v1);
        this.c1 = c1;
    }

    public Child_class(int c1) {
        super(100);
        this.c1 = c1;

    }
}
