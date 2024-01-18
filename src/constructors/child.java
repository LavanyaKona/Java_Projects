package constructors;

public class child extends parent {

    public int c1;

    public child(int v1, int c1) {
        super(v1);
        this.c1 = c1;
    }

    public child(int c1) {
        super(100);
        this.c1 = c1;

    }
}
