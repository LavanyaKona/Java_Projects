package ConstructorPackage;

public class Main {
    public static void main(String[] args) {

        Child_class childObject1 = new Child_class(10, 20);
        System.out.println("Parent Variable: " + childObject1.v1);
        System.out.println("Child Variable: " + childObject1.c1);

        Child_class childObject2 = new Child_class(30);
        System.out.println("Parent Variable: " + childObject2.v1);
        System.out.println("Child Variable: " + childObject2.c1);
    }
}
