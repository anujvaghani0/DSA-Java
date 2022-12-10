package ObjectOrientedProgramming.Inheritances;

public class cube extends Box {
    double depth;

    public cube(double length, double height, double width, double depth) {
        super(length, height, width);
        this.depth = depth;
    }

    public cube() {
        this.depth = -1;
    }
}
