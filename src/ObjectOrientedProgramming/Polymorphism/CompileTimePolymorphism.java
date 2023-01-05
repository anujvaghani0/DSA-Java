package ObjectOrientedProgramming.Polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Anuj Vaghani";
        st.age = 21;
        st.printInfo(st.name);
        st.printInfo(st.age);
        st.printInfo(st.name, st.age);
    }

    static public class Student {
        String name;
        int age;

        public void printInfo(String name) {
            System.out.println("My name is " + name);
        }

        public void printInfo(int age) {
            System.out.println("My age is " + age);
        }

        public void printInfo(String name, int age) {
            System.out.println("My name is " + name + " age whose " + age);
        }

    }
}
