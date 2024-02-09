package threads;

public class ResourceHolder {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public Object getResource1() {
        return resource1;
    }

    public Object getResource2() {
        return resource2;
    }
}
