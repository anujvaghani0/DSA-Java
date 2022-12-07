package ObjectOrientedProgramming;

public class Constructors {
    public static void main(String[] args) {
//        student st = new student();
        Student[] st1 = new Student[5];
//        System.out.println(Arrays.toString(st1));

//        Student anuj = new Student();
        Student anuj = new Student(70, "Anuj V Vaghani", 85.0f);

//        final class not been changed
//        final int ans=5;
//        ans=6;
//        anuj.rollNo = 70;
//        anuj.name = "Anuj Vaghani";
//        anuj.marks = 77.5f;


//        anuj.changesName("Rohit sharma");
//        anuj.greeting();
        System.out.println(anuj.rollNo);
        System.out.println(anuj.name);
        System.out.println(anuj.marks);

        Student random = new Student(anuj);
        System.out.println(random.name);

        Student random1 = new Student();
        System.out.println(random1.name);

        Student one = new Student();
        Student two = one;
        System.out.println(two.name);
    }


//    Create the new class

    static class Student {
        int rollNo;
        String name;
        float marks;

        void greeting() {
            System.out.println("Hello ! good morning " + name);
        }

        void changesName(String newName) {
            name = newName;
        }

        //        Student() {
//            this.rollNo = 70;
//            this.name = "Anuj Vaghani";
//            this.marks = 77.5f;
//        }

        Student() {
            this(70, "Default person name", 100.0f);
        }

        Student(int roll, String name, float marks) {
            this.rollNo = roll;
            this.name = name;
            this.marks = marks;
        }

        Student(Student other) {
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.marks = other.marks;
        }
    }


}
