package constructors;

public class Main {
    public static void main(String[] args) {

        child childObj = new child(10, 20);
        System.out.println("Parent Variable: " + childObj.v1);
        System.out.println("Child Variable: " + childObj.c1);

        child childObj1 = new child(30);
        System.out.println("Parent Variable: " + childObj1.v1);
        System.out.println("Child Variable: " + childObj1.c1);
    }
}
