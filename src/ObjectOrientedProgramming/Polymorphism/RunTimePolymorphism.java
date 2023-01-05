package ObjectOrientedProgramming.Polymorphism;

public class RunTimePolymorphism extends Student {
    @Override
    public void information() {
        super.information();
        System.out.println("Print the student beach 2023");
    }

    public static void main(String[] args) {
        Student st = new RunTimePolymorphism();
        st.information();
    }
}

class Student {
    public void information() {
        System.out.println("Print the student beach 2022");
    }
}



