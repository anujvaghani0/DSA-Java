package ObjectOrientedProgramming.Inheritances;

public class Box {
    double length;
    double height;
    double width;

    public Box() {
        super();
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    public Box(double side) {
        this.height = side;
        this.width = side;
        this.length = side;
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    //    Copy Constructor
    public Box(Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }


    public void information() {
        System.out.println("Running the Box...");
    }
}
