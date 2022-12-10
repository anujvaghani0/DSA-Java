package ObjectOrientedProgramming.Inheritances;

public class main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box = new Box(4);
//        System.out.println(box.length + " " + box.height + " " + box.width);

//        cube box = new cube();
//        cube box = new cube(3, 4, 5, 6);
//        System.out.println(box.length + " " + box.height + " " + box.width + " " + box.depth);

        Box box=new cube(4,5,6,7);
//        In this condition not access depth method because new object only refer Box class
        System.out.println(box.length);

//        this is things wrong because Box class is parent class don't access direct to cube class
//        cube box1=new Box(4,5,6);
    }
}
