package keywords;

final class FinalConcept {
    final int var = 100;
    final void final_method() {
        System.out.println("In final method through final class..");
    }
}
class AnotherClass {
    public static void main(String[] args) {
        FinalConcept fv = new FinalConcept();

        System.out.println("Final variable Value though final class: " + fv.var);

        fv.final_method();
    }
}

