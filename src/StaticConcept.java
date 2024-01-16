public class StaticConcept {
    private static int var;

    public static int static_method() {
        return var;
    }

    public static void main(String[] args){
        StaticConcept sc=new StaticConcept();
        var=100;
        int result=sc.static_method();
        System.out.println("Accessing static variable through static method -> var = "+result);
    }


}
