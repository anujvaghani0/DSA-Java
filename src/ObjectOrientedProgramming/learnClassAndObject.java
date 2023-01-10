package ObjectOrientedProgramming;

public class learnClassAndObject {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Anuj Vaghani";
        st.age = 21;

        Student st2 = new Student(st);
        st2.printInfo();
    }

    static public class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

//        public Student(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }

        //        copy constructor
        public Student(Student st2) {
            this.name = st2.name;
            this.age = st2.age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Student() {
        }
    }
}
