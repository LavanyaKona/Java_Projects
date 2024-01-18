package constructors;

public class Main {
    public static void main(String[] args) {

        child childObject1 = new child(10, 20);
        System.out.println("Parent Variable: " + childObject1.v1);
        System.out.println("Child Variable: " + childObject1.c1);

        child childObject2 = new child(30);
        System.out.println("Parent Variable: " + childObject2.v1);
        System.out.println("Child Variable: " + childObject2.c1);
    }
}
