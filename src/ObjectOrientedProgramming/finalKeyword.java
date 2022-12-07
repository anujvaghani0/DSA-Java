package ObjectOrientedProgramming;

public class finalKeyword {
    public static void main(String[] args) {
        final A anuj = new A("Anuj Vaghani");
        anuj.name = "name is changed but object is do not changes";

//        it has given me error because class is final do not change again
//        anuj=new A("hello");

        System.out.println(anuj.name);


//        Garbage collections delete
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

    }

    static class A {
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }

    }
}
