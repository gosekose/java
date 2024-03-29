package lambda;

public class UsingThis {

    public int outerField = 10;

    class Inner {
        int innerField = 20;

        void method() {

            MyFunctionalInterface fi = () -> {
                System.out.println("outerField = " + outerField);
                System.out.println("this.innerField = " + this.innerField);
            };

            fi.method();
        }
    }
}
