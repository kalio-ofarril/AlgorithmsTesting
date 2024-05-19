package Utils.Objects;

public class Circle implements Comparable<Circle>{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) return 1;
        if (this.radius == o.radius) return 0;
        return -1;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "This Circle is of radius: " + this.radius;
    }

}
